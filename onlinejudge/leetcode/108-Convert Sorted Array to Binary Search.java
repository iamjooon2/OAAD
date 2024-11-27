/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        int mid = nums.length / 2;
        TreeNode head = new TreeNode(nums[mid]);

        head.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        head.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));

        return head;
    }
}
