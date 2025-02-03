# @param {Integer[]} nums
# @return {Integer}
def longest_monotonic_subarray(nums)
  return nums.length if nums.length <= 1
  
  increase = 1
  decrease = 1
  max_len = 1
  
  (1...nums.length).each { |i|
      if nums[i] > nums[i - 1]
          increase += 1
          decrease = 1
      elsif nums[i] < nums[i - 1]
          decrease += 1
          increase = 1
      else
          increase = 1
          decrease = 1
      end

      max_len = [max_len, increase, decrease].max
  }
  max_len
end
