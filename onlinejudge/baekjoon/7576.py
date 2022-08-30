from collections import deque

m, n = map(int, input().split())
arr = []
# 익은 토마토를 저장해둘 큐
queue = deque([])

# 리스트 입력받는다
for i in range(n):
    arr.append(list(map(int, input().split())))
    for j in range(m):
        if arr[i][j] == 1:
            queue.append([i, j])

# 이동 방향을 정의해둔 리스트
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]


def bfs():
    while queue:
        # 맨 처음 토마토 좌표 맨 처음에 꺼내준다
        x, y = queue.popleft()

        # 익힐 토마토를 찾는다
        for i in range(4):
            a = x + dx[i]
            b = y + dy[i]
            # 좌표 크기가 넘어가는지 확인하고, 토마토가 익지 않은채로 있어야 한다
            if 0 <= a < n and 0 <= b < m and arr[a][b] == 0:
                # 익히고 1을 더하며 횟수를 센다
                queue.append([a, b])
                arr[a][b] = arr[x][y] + 1

bfs()
answer = 0

# 최단거리를 arr에 표시한 뒤, 0이 존재하면 -1을 출력한다
for i in arr:
    for j in i:
        # 토마토가 익지 못한 경우
        if j == 0:
            print(-1)
            exit(0)
    # 다 익힌 경우 최댓값으로
    answer = max(answer, max(i))
# 아직 모르겠으나 1씩 큰 숫자가 출력됐음
print(answer-1)