# @param {Integer[]} nums
# @return {Boolean}
def is_array_special(nums)
  nums.each_with_index {|num, index|
      if index == nums.length - 1
          break
      end
      if nums[index] % 2 == nums[index + 1] % 2
          return false
      end
  }
  true
end
