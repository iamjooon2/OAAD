colors = ["black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"]

first = input()
second = input()
last = input()

value = str(colors.index(first)) + str(colors.index(second))

print(int(value) * (10 ** colors.index(last)))