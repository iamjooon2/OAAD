# @param {String} s
# @param {String} t
# @return {Character}
def find_the_difference(s, t)
  if s.length == 0
      return t
  end

  hash_table = Hash.new(0)
  
  s.each_char { |element|
      hash_table[element] += 1
  }

  t.each_char { |element|
      hash_table[element] -= 1
  }

  hash_table.each_key { |key|
      if hash_table[key] != 0
          return key
      end
  }
  return nil
end
