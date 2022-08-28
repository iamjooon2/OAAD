def dfs(graph, v, visited):
    # 시작하는 노드 방문 처리
    visited[v] = True
    print(v, end = ' ')
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)

# 각 노드가 연결된 정보를 담아준다
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

# 함수 호출(연결 정보, 첫번째 노드, 방문 여부)
dfs(graph, 1, visited)

# 순서