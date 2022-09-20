def merge_sort(a):
    def sort(unsorted_list):
        if len(unsorted_list) <= 1:
            return
        mid = len(unsorted_list) // 2
        left = unsorted_list[:mid]
        right = unsorted_list[mid:]
        merge_sort(left)
        merge_sort(right)
        merge(left, right)

    def merge(left, right):

        i, j, k = 0, 0, 0
        while (i < len(left)) and (j < len(right)):
            if left[i] < right[j]:
                a[k] = left[i]
                i += 1
                k += 1
            else:
                a[k] = right[j]
                j += 1
                k += 1
        # 남은 데이터 삽입
        while i < len(left):
            a[k] = left[i]
            i += 1
            k += 1
        while j < len(right):
            a[k] = right[j]
            j += 1
            k += 1
        print(a)
    sort(a)