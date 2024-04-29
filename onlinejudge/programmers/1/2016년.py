def solution(a, b):
    total = 0
    date = ["FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"]
    days = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    for i in range(a - 1):
        total += days[i]
    total += b - 1
    answer = total % 7
    return date[answer]
