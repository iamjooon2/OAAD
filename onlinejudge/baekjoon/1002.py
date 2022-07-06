import math

for i in range(int(input())):
    x1, y1, r1, x2, y2, r2 = map(int, input().split())
    distance = math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)
    # 합동이면서 좌표 같을 때
    if distance == 0 and r1 == r2:
        print(-1)
    # 한 점에서 만날 때
    elif r1 + r2 == distance or abs(r2 - r1) == distance:
        print(1)
    # 두 점에서 만날 때
    elif abs(r2 - r1) < distance < (r1 + r2):
        print(2)
    # 만날 일 없을 때
    else:
        print(0)