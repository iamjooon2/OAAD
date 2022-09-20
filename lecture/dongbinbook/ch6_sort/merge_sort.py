array = [3, 7, 1, 6, 2, 9, 10]

def merge_sort(array):
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
                array[k] = left[i]
                i += 1
                k += 1
            else:
                array[k] = right[j]
                j += 1
                k += 1
        # 남은 데이터 삽입
        while i < len(left):
            array[k] = left[i]
            i += 1
            k += 1
        while j < len(right):
            array[k] = right[j]
            j += 1
            k += 1
        print(array)
    sort(array)