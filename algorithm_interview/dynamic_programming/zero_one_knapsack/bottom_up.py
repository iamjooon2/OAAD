def zero_one_knapsack_bottom_up(i, knapsack_weight, weight, profit):
    if (i <= 0 or knapsack_weight <= 0):
        return 0
    if (weight[i] > knapsack_weight):
        value = zero_one_knapsack_bottom_up(i - 1, knapsack_weight, weight, profit)
        print(i - 1, knapsack_weight, value)
        return value
    else:
        left = zero_one_knapsack_bottom_up(i - 1, knapsack_weight, weight, profit)
        print(i - 1, knapsack_weight, left)
        right = zero_one_knapsack_bottom_up(i - 1, knapsack_weight - weight[i], weight, profit)
        print(i - 1, knapsack_weight - weight[i], right)
        return max(left, profit[i] + right)


knapsack_weight = 15
weight = [12, 1, 4, 1, 2]
profit = [4, 2, 10, 1, 2]

result = zero_one_knapsack_bottom_up(len(weight)-1, knapsack_weight, weight, profit)

print(result)