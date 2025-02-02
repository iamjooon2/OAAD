# today : string
# terms : string[]
# privacies : string[]
# return: Integer[]
def solution(today, terms, privacies)
  period = Hash.new(0)
  terms.each {|term|
      term_name = term.split(" ")[0]
      value = term.split(" ")[1].to_i
      
      value *= 28

      period[term_name] = value
  }
  
  answer = []
  privacies.each_with_index {|privacy, index|
      date = privacy.split(" ")[0]
      term = privacy.split(" ")[1]
      
      signed_day = to_int_days(date)
      
      if signed_day + period[term] <= to_int_days(today)
          answer.append(index + 1)
      end
  }
  
  return answer
end


def to_int_days(day)
  splited = day.split(".")
  
  year = splited[0].to_i
  month = splited[1].to_i
  day = splited[2].to_i
  
  return day + month * 28 + year * 12 * 28
end
