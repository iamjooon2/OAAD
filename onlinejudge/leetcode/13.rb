# @param {String} s
# @return {Integer}
def roman_to_int(s)
    map = {
        "I" => 1,
        "V" => 5,
        "X" => 10,
        "L" => 50,
        "C" => 100,
        "D" => 500,
        "M" => 1000,
    }
    sum = 0
    arr = s.split('')
    for i in 1...arr.length
        before = map[arr[i - 1]]
        after = map[arr[i]]

        if before >= after
            sum += before
        else
            sum -= before
        end 
    end
    last_element_index = arr.length - 1
    return sum + map[arr[last_element_index]]
end