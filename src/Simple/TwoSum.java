package Simple;

import java.util.ListIterator;

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


    public ListNode firstAdd(ListNode node1, ListNode node2)
    {
        ListNode current = new ListNode(0);
        ListNode head = current;

        while (node1 != null)
        {
            current.val = node1.val;

            node1 = node1.next;
            if (node1 != null)
            {
                current.next = new ListNode(0);
                current = current.next;
            }
        }

        current = head;

        while (node2 != null)
        {
            current.val += node2.val;
            node2 = node2.next;
            if (node2 != null && current.next == null)
            {
                current.next = new ListNode(0);
            }
            current = current.next;
        }
        return head;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode current = firstAdd(l1, l2);
        ListNode head = current;

        while (current != null)
        {
            if (current.val > 9)
            {
                int firstDigit = current.val % 10;
                current.val = firstDigit;

                if (current.next == null)
                {
                    current.next = new ListNode(1);
                }
                else
                {
                    current.next.val += 1;
                }
            }
            current = current.next;
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
        ListNode l1 = new ListNode(9);
        ListNode l1Head = l1;


        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode l2Head = l2;
        ListNode answer = rawrs.addTwoNumbers(l1Head, l2Head);


        while (answer != null)
        {
            System.out.println(answer.val);
            answer = answer.next;
        }
    }
}