# @param {Integer[]} nums1
# @param {Integer[]} nums2
# @return {Integer[]}
def intersect(nums1, nums2)
  hash_table1 = Hash.new(0)
  hash_table2 = Hash.new(0)

  nums1.each { |num1|
      hash_table1[num1] += 1
  }

  nums2.each { |num2|
      hash_table2[num2] += 1
  }

  answer = []
  hash_table1.each { |key, value1|
      hash2_value = hash_table2[key]

      if hash2_value != nil && hash2_value >= 1
          [value1, hash2_value].min.times {
              answer.append key
          }
      end
  }
  return answer
end
