sub_number=int(input())
score_list=list(map(int, input().split()))

answer=sum(score_list)/max(score_list)*100

print(answer/sub_number)