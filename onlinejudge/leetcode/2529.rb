# @param {Integer[]} nums
# @return {Integer}
def maximum_count(nums)
    positives = nums.count { |num| num > 0 }
    negatives = nums.count { |num| num < 0 }
    [positives, negatives].max
end
