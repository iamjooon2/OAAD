array = [3, 5]

# 타 언어, 두 변수를 교환하려 할 때는 임시 변수를 하나 두고 돌려야 한다
tmp = array[0]
array[0] = array[1]
array[1] = tmp
print('C style swap: ', array)


array = [3, 5]

# 파이썬
array[0], array[1] = array[1], array[0]
print('pythonic swap: ', array)