# @param {Integer[]} nums1
# @param {Integer[]} nums2
# @return {Integer[]}
def intersection(nums1, nums2)
  set1 = Set.new
  set2 = Set.new

  nums1.each { |num1|
      set1.add num1
  }
  nums2.each { |num2|
      set2.add num2
  }

  hash_table = Hash.new

  set1.each { | num1 |
      if hash_table[num1] == nil
          hash_table[num1] = 1
      else
          hash_table[num1] += hash_table[num1]
      end
  }

  set2.each { | num2 |
      if hash_table[num2] == nil
          hash_table[num2] = 1
      else
          hash_table[num2] += hash_table[num2]
      end
  }

  answer = []
  hash_table.each_key { |key|
      if hash_table[key] >= 2
          answer.append key
      end
  }
  answer
end
