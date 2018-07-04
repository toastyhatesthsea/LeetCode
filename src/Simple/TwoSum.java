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


    /**Definition for singly-linked list.
     *
     */
    public class ListNode {
        int val;
         ListNode next;

        ListNode(int x) {
            val = x; }
      }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode answer = new ListNode(0);
        boolean carry = false;
        ListNode current = answer;

        while (l1.next != null)
        {
            answer.val = l1.val;
            l1 = l1.next;
            answer.next = new ListNode(0);
        }

        while (l2.next != null)
        {
            int secondDigit = l2.val;

            if(current.val + secondDigit > 9)
            {

            }
        }

        return answer;

    }
}
