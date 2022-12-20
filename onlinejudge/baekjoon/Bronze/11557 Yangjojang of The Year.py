T = int(input())

for i in range(T):
    N = int(input())
    max_drink = 0
    max_school = ""

    for j in range(N):
        name, drink = map(str, input().split())
        drink = int(drink)
        if (drink > max):
            max_drink = drink
            max_school = name
    print(max_school)

