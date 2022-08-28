from collections import deque

def bfs(graph, start, visited):
    # 큐 구현 위해서 deque 라이브러리 사용
    queue = deque([start])
    # 현재 노드 방문 처리
    visited[start] = True
    # 큐가 빌 때 까지 반복
    while queue:
        # 큐에서 하나의 원소를 뽑아서 출력
        v = queue.popleft()
        print(v, end = ' ')
        # 해당 원소와 연결된 방문하지 않은 원소들을 큐에 삽입한다
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

# 방문 정보를 2차원 자료형으로 표현
graph = [
    [],
    [2, 5],
    [1,3,4],
    [2],
    [2],
    [1,6,7],
    [5],
    [5,8],
    [7]
]

# 방문 정보를 담은 리스트
visited = [False] * 9

bfs(graph, 1, visited)