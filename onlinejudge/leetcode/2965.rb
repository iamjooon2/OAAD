def find_missing_and_repeated_values(grid)
  n = grid.length ** 2
  set = Set.new
  answer = [0, 0]

  grid.each do |row|
    row.each do |num|
      if set.include?(num)
        answer[0] = num
        break
      end
      set.add(num)
    end
  end

  (1..n).each do |i|
    unless set.include?(i)
      answer[1] = i
      break
    end
  end

  answer
end
