def fib_top_down(n):
    if n <= 1:
        return n

    if dp[n]:
        return dp[n]
    dp[n] = fib(n-1) + fib(n-2)
    return dp[n]

fib_top_down(n)