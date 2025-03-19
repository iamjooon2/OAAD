# @param {Integer[]} nums
# @return {Integer}
def min_operations(nums)
    count = 0

    (0..nums.length - 3).each do |i|
      if nums[i] == 0
        (0..2).each { |j| 
            nums[i + j] = nums[i + j] == 0 ? 1 : 0 
        }
        count += 1
      end
    end

    nums.include?(0) ? -1 : count
end
