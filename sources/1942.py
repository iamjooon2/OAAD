day_sum = 0
day = [31,28,31,30,31,30,31,31,30,31,30,31]
dayprint = ['MON','TUE','WED','THU','FRI','SAT','SUN']

m,d = map(int,(input().split()))

for i in range(m-1):
  day_sum += day[i]

day_sum += d
print(dayprint[day_sum%7-1])