T = int(input())

for i in range(T):
    E, W = input().split()
    E = int(E)
    front = W[0:E-1]
    back = W[E:]
    print(front+back)