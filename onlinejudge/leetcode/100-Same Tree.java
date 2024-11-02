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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 둘 다 null이라면 same tree
        if (p == null && q == null) {
            return true;  
        }

        // 둘 중 하나만 null이라면 same tree가 아님
        if (p == null || q == null) {
            return false;
        } 

        // 두 노드가 모두 null이 아니라면 same tree가 아님
        if (p.val != q.val) {
            return false;
        } 

        // 같은 값이라면 왼쪽끼리 비교, 오른쪽끼리 비교
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

