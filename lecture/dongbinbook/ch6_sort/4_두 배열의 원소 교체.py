
# 준희는 두 개의 리스트 A와 B를 가지고 있다.  두 리스트는 N개의 원소로 구성되어 있으며, 배열의 원소는 모두 자연수이다.
# 준희는 최대 K의 바꿔치기 연산을 수행할 수 있는데, 바꿔치기 연산이란 “리스트 A에 있는 원소 하나와 리스트 B에 있는 원소 하나를 골라서 두 원소를 서로 바꾸는 것”을 말한다.
# 준희의 최종 목표는 리스트 A의 모든 원소의 합이 최대가 되도록 하는 것이며, 현석이는 준희를 도와야 한다.

# N, K 그리고 리스트 A와 B의 정보가 주어졌을 때, 최대 K번의 바꿔치기 연산을 수행하며 만들 수 있는 리스트 A의 모든 원소의 합의 최댓값을 출력하는 프로그램을 작성하시오

n, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

a.sort()
b.sort(reverse=True)

for i in range(k):
    # A의 원소가 B의 원소보다 작은 경우
    if a[i] < b[i]:
        # 두 원소를 교체
        a[i], b[i] = b[i], a[i]
    # A의 원소가 B의 원소보다 크거나 같을 때
    else:
        # 반복문을 탈출
        break

print(sum(a))