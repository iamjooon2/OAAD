#a까지 더하는 함수 만들기
def solve(a):
    sum = 0
    for i in a: #list comprehension
        sum += i
    return sum