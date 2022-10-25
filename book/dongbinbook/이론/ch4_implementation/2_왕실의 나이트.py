# 8x8의 좌표평면의 왕실 정원에서 나이트는 L자 모양으로만 이동할 수 있다. L자 이동 모양은 다음과 같다
# 1. 수평으로 두 칸 이동 후 수직으로 한 칸 이동
# 2. 수직으로 두 칸 이동 후 수평으로 한 칸 이동
# 8x8 좌표평면 상에서 나이트의 위치가 주어졌을 때 나이트가 이동할 수 있는 경우의 수를 출력하는 프로그램을 작성하시오
# 행은 1부터 8로, 열은 a부터 h로 표현한다
# 예) a1은 왼쪽 맨 위, 여기서 오른쪽으로 두 칸 이동 후 밑으로 한 칸 이동시 b3

location = input()

row = int(location[1])
col = int(ord(location[0])) - int(ord('a')) + 1 # ord() 아스키연산

print(row)
# 이동할 수 있는 방향 정의
steps = [(-2, -1), (-2, 1), (-1, -2), (-1, 2), (1, -2), (1, 2), (2, -1), (2, 1)]

# 8가지 방향에 대해 각 위치로 이동이 가능한지 확인한다
result = 0
for step in steps:
    next_row = row + step[0]
    next_col = col + step[1]
    # 해당 위치로 이동이 가능하다면 result를 증가시킨다
    if next_row > 0 and next_col > 0 and next_col < 9 and next_row < 9:
        result += 1

print(result)