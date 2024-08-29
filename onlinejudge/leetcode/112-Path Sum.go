func hasPathSum(root *TreeNode, targetSum int) bool {
	if root == nil {
			return false
	}
	
	// Check if it's a leaf node and the targetSum equals the node's value
	if root.Val == targetSum && root.Left == nil && root.Right == nil {
			return true
	}
	
	// Recursively check left and right subtrees
	return hasPathSum(root.Left, targetSum-root.Val) || hasPathSum(root.Right, targetSum-root.Val)
}
