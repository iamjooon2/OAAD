# N명의 학생 정보가 있다. 학생 정보는 학생의 이름과 학생의 성적으로 구분된다
# 각 학생의 이름과 성적 정보가 주어졌을 때,
# 성적이 낮은 순서대로 학생의 이름을 출력하는 프로그램을 작성하시오

n = int(input())

array = []
for i in range(n):
    input_data = input().split()
    array.append(input_data[0], int(input_data[1]))

for i in range(len(array)-1, 0, -1):
    for j in range(i):
        if array[1][j] < array[1][j+1]:
            array[1][j], array[j+1] = array[1][j+1], array[1][j]
            array[0][j+1], array[0][j] = array[0][j], array[0][j+1]

for i in array:
    print(i[1], end=' ')
