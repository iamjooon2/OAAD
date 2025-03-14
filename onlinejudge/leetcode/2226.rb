# @param {Integer[]} candies
# @param {Integer} k
# @return {Integer}
def maximum_candies(candies, k)
  # validate
  return 0 if candies.sum < k

  left = 1
  right = candies.max

  while left <= right
    mid = left + (right - left) / 2
    if can_distribute(candies, k, mid)
      left = mid + 1
    else
      right = mid - 1
    end
  end

  right
end

private

def can_distribute(candies, k, pile_size)
  count = candies.sum { |candy| candy / pile_size }
  count >= k
end