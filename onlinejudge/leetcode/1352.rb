class ProductOfNumbers
  def initialize()
      @arr = []
      @prod = 1
  end


=begin
  :type num: Integer
  :rtype: Void
=end
  def add(num)
  if num == 0
      @arr = []
      @prod = 1
      return
  end
  @prod *= num
  @arr << @prod
  end


=begin
  :type k: Integer
  :rtype: Integer
=end
  def get_product(k)
      return 0 if @arr.size < k

      answer = @arr[-1]
      return answer if @arr.size == k
      
      answer / @arr[-1 - k]
  end

end

# Your ProductOfNumbers object will be instantiated and called as such:
# obj = ProductOfNumbers.new()
# obj.add(num)
# param_2 = obj.get_product(k)
