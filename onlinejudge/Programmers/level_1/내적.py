def solution(a, b):
    sums = 0
    for i in range(len(a)):
        sums += a[i]*b[i]
    return sums