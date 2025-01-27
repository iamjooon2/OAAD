# @param {Integer[]} nums
# @param {Integer[]} index
# @return {Integer[]}
def create_target_array(nums, index)
  answer = []
  
  nums.each_with_index { |num, i|
    answer.insert(index[i], num)
  }
  
  return answer
end
