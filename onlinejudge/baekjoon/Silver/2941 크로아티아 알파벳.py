word = input()
alphabets = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
count = 0

for i in alphabets:
    if i in word:
        count += word.count(i)

answer = len(word) - count * 2 + count
print(answer)