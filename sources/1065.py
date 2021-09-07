def hansu(n):
  count = 0
  if n < 100:
    count = n
  else:
    count = 99
    for i in range(100, n + 1):
      n_split = list(map(int, str(i)))
        #123 -> ['1','2','3']
      if n_split[0] - n_split[1] == n_split[1] - n_split[2]:
        #한수의 조건인 등차수열 확인
        count += 1
  return count

n = int(input())
print(hansu(n))