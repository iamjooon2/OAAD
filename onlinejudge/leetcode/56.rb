# @param {Integer[][]} intervals
# @return {Integer[][]}
def merge(intervals)
  return intervals if intervals.length <= 1

  intervals.sort_by! { |interval| interval[0] }

  answer = [intervals[0]]

  intervals.each { |now|
      if now == intervals[0]
          next
      end

      last = answer[-1]

      if last[1] >= now[0]
          last[1] = [last[1], now[1]].max
      else
          answer.append now
      end
  }

  answer
end

