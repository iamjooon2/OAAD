# @param {String} s
# @return {Integer}
def length_of_last_word(s)
  arr = s.split(" ")
  return arr[arr.length - 1].length
end
