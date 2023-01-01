N = int(input())
num = 1
count = 0

while True:
    if "666" in str(num):
        count += 1
    if count == N:
        print(num)
        break
    num += 1