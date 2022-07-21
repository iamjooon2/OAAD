# 시뮬레이션 유형

# 여행가 A는 N x N 크기의 정사각형 공간 위에 서 있다.
# 이 공간은 1 x 1 크기의 정사각형으로 나누어져 있다. 가장 왼족 위 좌표는 (1.1)이며, 가장 오른쪽 아래 좌표는 (N,N)에 해당한다.
# 여행가 A는 상, 하, 좌, 우 방향으로 이동할 수 있으며, 시작 좌표는 항상 (1,1)이다.
# L : 왼쪽으로 한 칸 이동
# R : 오른쪽으로 한 칸 이동
# U : 위쪽으로 한 칸 이동
# D : 아래쪽으로 한 칸 이동

# 첫 줄에 NxN의 N이 입력되고
# 둘째 줄에는 이동계획이 입력된다
N = int(input())

# 좌표
x, y = 1, 1

plans = input().split()

# L, R, U, D에 따른 이동 방향
move_types = ['L', 'R', 'U', 'D']
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

# 이동 계획 확인
for plan in plans:
    # 이동 후 좌표 구하기
    for i in range(len(move_types)):
        if plan == move_types[i]:
            nx = y + dx[i]
            ny = y + dy[i]
    # 공간을 벗어나는 경우 무시하기
    if nx < 1 or ny < 1 or nx > N or ny > N:
        continue
    # 이동 수행하기
    x, y = nx, ny

print(x, y)