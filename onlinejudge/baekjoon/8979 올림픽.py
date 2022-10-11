N, K = map(int, input().split())

medals = []
for i in range(N):
    medals.append(list(map(int, input().split())))
# 금 은 동 순서대로 정렬하기
medals.sort(key=lambda x:(-x[1],-x[2],-x[3]))

# 찾고자 하는 국가의 인덱스를 추출
for i in range(N):
    if medals[i][0] == K:
        nation_idx = i

# 등수 찾아서 리턴
for i in range(N):
    if medals[nation_idx][1:] == medals[i][1:]:
        print(i+1)
        break