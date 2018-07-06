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
        ListNode answer = new ListNode(0);
        ListNode head = answer;

        while (node1 != null)
        {
            answer.val = node1.val;
            answer = answer.next;
            node1 = node1.next;
            if (node1 != null)
            {
                answer = new ListNode(0);
            }
        }

        answer = head;

        while (node2 != null)
        {
            answer.val += node2.val;
            node2 = node2.next;
            if (node2 != null && answer.next == null)
            {
                answer.next = new ListNode(0);
                answer = answer.next;
            }
        }
        return head;
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
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l1Head = l1;


        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode l2Head = l2;
        ListNode answer = rawrs.firstAdd(l1Head, l2Head);

        while (answer != null)
        {
            System.out.println(answer.val);
            answer = answer.next;
        }
    }
}