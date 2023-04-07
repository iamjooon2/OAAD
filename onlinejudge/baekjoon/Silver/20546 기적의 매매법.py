money = int(input())
stocks = list(map(int, input().split()))

moneyA = money
moneyB = money

stockCount = 0
for stock in stocks:
    if moneyA >= stock:
        buyable = moneyA // stock
        stockCount += buyable
        moneyA -= buyable * stock

profitA = moneyA + stockCount * stocks[13]

stockCount = 0
for i in range(10):
    first = stocks[i]
    second = stocks[i+1]
    third = stocks[i+2]
    targetStock = stocks[i+3]
    if first > second and second > third and moneyB >= targetStock:
        buyable = moneyB // targetStock
        stockCount += buyable
        moneyB -= buyable * targetStock
    elif first < second and second < third and stockCount > 0:
        sellMoney = targetStock * stockCount
        stockCount = 0
        moneyB += sellMoney

profitB = moneyB + stockCount * stocks[13]

if profitA > profitB:
    print("BNP")
elif profitA < profitB:
    print("TIMING")
else:
    print("SAMESAME")