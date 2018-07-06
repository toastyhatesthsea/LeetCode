package Simple;

public class TwoSum
{

    public int[] twoSum(int[] nums, int target) {

        int firstIndex = -1;
        int secondIndex = -1;
        boolean foundAnswer = false;

        for (int i = 0; i < nums.length - 1 && !foundAnswer; i++)
        {
            for (int j = i + 1; j < nums.length && !foundAnswer; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    firstIndex = i;
                    secondIndex = j;
                    foundAnswer = true;
                }
            }
        }

        int[] indices = {firstIndex, secondIndex};
        return indices;
    }





    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode answer = new ListNode(0);
        ListNode head = answer;
        boolean carry = false;
        ListNode current = head;

        while (l1 != null)
        {
            answer.val = l1.val;
            l1 = l1.next;

            if (l1 != null)
            {
                answer.next = new ListNode(0);
                answer = answer.next;
            }
        }

        while (l2 != null)
        {
            int secondDigit = l2.val;
            int totalValue = 0;

            if (current != null)
            {
                if (carry)
                {
                    totalValue = current.val + secondDigit + 1;
                } else
                {
                    totalValue = current.val + secondDigit;
                }

                if (totalValue > 9)
                {
                    carry = true;
                    current.val = 0;
                    if (current.next == null)
                    {
                        ListNode newLink = new ListNode(1);
                        current.next = newLink;
                    }
                }
                else
                {
                    carry = false;
                    current.val = totalValue;
                }
            }
            else
            {
                current = new ListNode(l2.val);
            }
            current = current.next;
            l2 = l2.next;
        }

        return head;
    }
}

/**Definition for singly-linked list.
 *
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x; }
}


class SolutionTesters
{
    public static void main(String[] arsgs)
    {
        TwoSum rawrs = new TwoSum();
        ListNode l1 = new ListNode(2);
        ListNode l1Head = l1;
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        ListNode l2Head = l2;
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode answer = rawrs.addTwoNumbers(l1Head, l2Head);
    }
}