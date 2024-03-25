func isPalindrome(head *ListNode) bool {
	var list []int

	current := head
	list = append(list, head.Val)
	for current.Next != nil {
		current = current.Next
		number := current.Val
		list = append(list, number)
	}

	size := len(list)
	for i := 0; i < size/2; i++ {
		if list[i] != list[size-i-1] {
			return false
		}
	}
	return true
}
