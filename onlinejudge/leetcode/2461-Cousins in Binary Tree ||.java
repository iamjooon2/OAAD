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
    public TreeNode replaceValueInTree(TreeNode root) {
        int[] total = new int[100_001];

        Queue<DepthNode> queue = new LinkedList<>();

        queue.add(new DepthNode(root, 1));
        while (!queue.isEmpty()) {
            DepthNode node = queue.poll();
            total[node.depth] += node.val;

            if (node.left != null) {
                queue.add(new DepthNode(node.left, node.depth + 1));
            }
            
            if (node.right != null) {
                queue.add(new DepthNode(node.right, node.depth + 1));
            }
        }
        dfs(total, 1, root);
        root.val = 0;
        return root;
    }

    private void dfs(int[] total, int depth, TreeNode node) {
        int sum = 0;
        if (node.left != null) {
            dfs(total, depth + 1, node.left);
            sum += node.left.val;
        }

        if (node.right != null) {
            dfs(total, depth + 1, node.right);
            sum += node.right.val;
            node.right.val = total[depth + 1] - sum;
        }

        if (node.left != null) {
            node.left.val = total[depth + 1] - sum;
        }
    }

    static class DepthNode {
        TreeNode node;
        int depth;
        TreeNode left;
        TreeNode right;
        int val;

        DepthNode(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
            this.right = node.right;
            this.left = node.left;
            this.val = node.val;
        }
    }
}
