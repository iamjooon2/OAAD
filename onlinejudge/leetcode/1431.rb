# @param {Integer[]} candies
# @param {Integer} extra_candies
# @return {Boolean[]}
def kids_with_candies(candies, extra_candies)
  max_candy = candies.max
  answer = []
  candies.each { |candy|
      if candy + extra_candies >= max_candy
          answer.append true
      else
          answer.append false
      end
  }
  return answer
end
