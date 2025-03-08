class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minWhite = Integer.MAX_VALUE;
        int whiteCount = 0;

        // 슬라이딩 윈도우 계산
        for (int i = 0; i < k; i += 1) {
            if (blocks.charAt(i) == 'W') {
                whiteCount += 1;
            }
        }
        minWhite = whiteCount;

        // 슬라이딩 윈도우를 이동하면서 최소 W 개수 찾기
        for (int i = k; i < blocks.length(); i += 1) {
            if (blocks.charAt(i) == 'W') {
                whiteCount += 1;
            } 
            if (blocks.charAt(i - k) == 'W') {
                whiteCount -= 1;
            }

            minWhite = Math.min(minWhite, whiteCount);
        }

        return minWhite;
    }
}
