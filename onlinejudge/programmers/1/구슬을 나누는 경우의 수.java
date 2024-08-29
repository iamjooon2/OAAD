class Solution {
    public int solution(int balls, int share) {
        if (balls == share || share == 0) {
            return 1;
        }
        return solution((balls -1), (share -1))
            + solution(balls - 1, share);
    }
}
