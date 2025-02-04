# 양의 정수로 이루어진 배열 nums가 주어졌을 때, 오름차순 부분 배열의 가능한 최대 합을 반환하세요.

# 부분 배열은 배열 내에서 연속된 숫자로 이루어진 시퀀스를 의미합니다.
# 부분 배열 [nums[l], nums[l+1], ..., 
# nums[r-1], nums[r]]이 오름차순이라는 것은, 
# 모든 l ≤ i < r에 대해 nums[i] < nums[i+1]을 만족하는 경우를 뜻합니다.
# 크기가 1인 부분 배열도 오름차순으로 간주됩니다.

# @param {Integer[]} nums
# @return {Integer}
def max_ascending_sum(nums)
  sum = nums[0]
  comparsion = nums[0]
  (0...nums.length - 1).each { |index|
    if nums[index] < nums[index + 1]
      comparsion += nums[index + 1]
    else
      comparsion = nums[index + 1]
    end
    sum = [sum, comparsion].max
  }
  sum
end
