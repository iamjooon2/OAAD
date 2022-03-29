N = int(input())
cute, not_cute = 0

for i in range(N):
    vote = int(input())
    if vote == 1:
        cute = cute + 1
    else:
        not_cute = not_cute + 1

if cute > not_cute:
    print('Junhee is cute!')
else:
    print('Junhee is not cute!')