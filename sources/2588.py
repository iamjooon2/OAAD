a = int(input())
b = int(input())

output1 = a * ((b % 100) % 10)
output2 = a * ((b % 100) // 10)
output3 = a * (b // 100)
result = a * b

print(output1, output2, output3, result, sep='\n') #개행문자