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




        return answer;

    }
}
