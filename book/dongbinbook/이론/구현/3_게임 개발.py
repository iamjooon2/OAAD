n, m = map(int, input().split())
x, y, direction = map(int, input().split())

# 방문 위치 저장용 지도 그리기 - list comprehension 사용
d = [ [0] * m for _ in range(n) ]

# 현재 좌표 방문 처리
# 0-> 미방문, 1-> 방문
d[x][y] = 1

# 입력받아 지도 그리기
array = []
for i in range(n):
    array.append(list(map(int, input().split())))

# 동 서 남 북 방향 정의
dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

# 왼쪽 턴 함수 그리기
def turn_left():
    global direction
    direction -= 1
    if direction == -1:
        direction = 3

count = 1
turn_time = 0

while True:
    # 왼쪽 회전
    turn_left()
    # 방향 좌표값 바꿈
    nx = x + dx[direction]
    ny = y + dy[direction]
    # 회전한 이후 정면에 가보지 않은 칸이 존재하는 경우 이동
    if d[nx][ny] == 0 and array[nx][ny] == 0:
        d[nx][ny] = 1
        x = nx
        y = ny
        count += 1
        turn_time = 0
        continue
    else:
        turn_time += 1
    # 네 방향 다 못갈 때
    if turn_time == 4:
        nx = x - dx[direction]
        dy = y - dy[direction]
        # 뒤로 갈 수 있으면 이동하기
        if array[nx][ny] == 0:
            x = nx
            y = ny
        else:
            break
        turn_time = 0

print(count)
