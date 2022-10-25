# 동빈이네 전자 매장에는 부품이 N개 있다. 각 부품은 정수 형태의 고유 번호가 있다.
# 어느날 손님이 M개 종류의 부품을 대량으로 구매하겠다며 당일날 견적서를 요청했다.
# 동빈이는 때를 놓치지 않고 문의한 부품 M개 종류를 모두 확인해서 견적서를 확인해야 한다.
# 이때 가게 안에 부품이 모두 있는지 확인하는 프로그램을 만들어보자
#
# 예를 들어 가게의 부품이 총 5개 일 때 부품 번호가 다음과 같다고 하자
# N = 5
# [8, 3, 7, 9, 2]
#
# 손님은 총 3개의 부품이 있는지 확인요청 했는데 부품 번호는 다음과 같다
# M = 3
# [5, 7, 9]
#
# 이때 부품이 있으면 yes, 없으면 no를 출력한다. 구분은 공백으로 한다


def binary_search(array, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        # 찾은 경우 중간점 인덱스 반환
        if array[mid] == target:
            return mid
        # 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
        elif array[mid] > target:
            end = mid - 1
        # 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
        else:
            start = mid + 1
    return None

N = int(input())
array = list(map(int, input().split()))
M = int(input())
x = list(map(int, input().split()))

array.sort()

for i in x:
    result = binary_search(array, i, 0, N-1)
    if result != None:
        print('yes', end = ' ')
    else:
        print('no', end = ' ')
