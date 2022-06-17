def zero_one_knapsack_backtracking (i, profit, weight):
    global maxprofit, numbest, bestset
    if (weight <= knapsack_weight and profit > maxprofit):
        maxprofit = profit
        numbest = i
        bestset = include[:]
    if (promising(i, profit, weight)):
        include[i + 1] = True
        zero_one_knapsack_backtracking(i + 1, profit + profit[i+1], weight + weight[i+1])
        include[i + 1] = False
        zero_one_knapsack_backtracking(i + 1, profit, weight)

def promising(i, profit, weight):
    if (weight > W):
        return False
    else:
        j = i + 1
        bound = profit
        totweight = weight
        while (j <= count and totweight + weight[j] <= knapsack_weight):
            totweight += weight[j]
            bound += profit[j]
            j += 1
        k = j
        if (k <= count):
            bound += (knapsack_weight - totweight) * profit[k] / weight[k]
        return bound > maxprofit

count = 5
knapsack_weight = 15
weight = [12, 1, 4, 1, 2]
profit = [4, 2, 10, 1, 2]
maxprofit = 0
numbest = 0
best_set = []
include = [False] * (count + 1)

zero_one_knapsack_backtracking(0, 0, 0)

print(best_set[1:len(best_set)])