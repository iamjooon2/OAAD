from collections import deque

n, m = map(int, input().split())

maze = []
for a in range(n):
    maze.append(list(map(int, input())))

# 이동할 네 방향을 정의한다
# 토마토 문제에서 사용한 방식
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def maze_runner(x, y):
    # bfs 해결을 위한 Queue 구현 위해 deque 라이브러리를 가지고 옵니다
    queue = deque()
    queue.append((x,y))
    # 큐가 빌 때까지 반복
    while queue:
        # 현재 위치를 가져옵니다
        x, y = queue.popleft()
        # 현재 위치에서 네 방향으로(상, 하, 좌, 우)의 위치 확인
        for i in range(4):
            nx = x + dx[i]
            ny = x + dy[i]
            # 미로의 공간을 벗어난 경우 무시한다
            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                continue
            # 괴물이 있는 경우 경우 무시한다
            if maze[nx][ny] == 0:
                continue
            # 해당 위치를 처음 방문할 때에만 최단 거리를 기록한다
            if maze[nx][ny] == 1:
                maze[nx][ny] = maze[x][y]+1
                queue.append((nx, ny))
    # 가장 오른쪽 아래까지의 최단거리 반환
    return maze[n-1][m-1]
result = maze_runner(0,0)
print(result)