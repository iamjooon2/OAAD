class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        List<Boolean> answer = new ArrayList<>();
        for (int i = 0; i < candies.length; i += 1) {
            if (candies[i] + extraCandies >= max) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }
        return answer;
    }
}

