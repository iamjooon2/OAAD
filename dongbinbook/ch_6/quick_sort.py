array = [5,7,9,0,3,1,6,2,4,8]

def quick_sort(array, start, end):
    if start >= end: #원소가 1인 경우 종료
        return
    pivot = start #피벗은 첫 번째 원소
    left = start + 1
    right = end
    while left <= right:
        #피벗보다 큰 테이블을 찾을때 까지 반복
        while left <= end and array[left] <= array[pivot]:
            left = left + 1
            #피벗보다 작은 데이터를 찾을 때까지 반복
        while right > start and array[right] >= array[pivot]:
            right = right - 1
        if left > right: #엇갈렸을시, 작은 데이터와 피벗을 교체
            array[right], array[pivot] = array[pivot],array[right]
        else:
            array[right], array[left] = array[left], array[right]
    quick_sort(array, start, right-1)
    quick_sort(array, right+1, end)

quick_sort(array, 0, len(array)-1)

print(array)