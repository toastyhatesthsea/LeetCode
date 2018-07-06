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


    private ListNode firstAdd(ListNode node1, ListNode node2)
    {

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode answer = new ListNode(0);
        ListNode head = answer;
        boolean carry = false;
        ListNode current = head;



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
        ListNode l1 = new ListNode(0);
        ListNode l1Head = l1;


        ListNode l2 = new ListNode(7);
        l2.next = new ListNode(3);
        ListNode l2Head = l2;

        ListNode answer = rawrs.addTwoNumbers(l1Head, l2Head);

        while (answer != null)
        {
            System.out.println(answer.val);
            answer = answer.next;
        }
    }
}