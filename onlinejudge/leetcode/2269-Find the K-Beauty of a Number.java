class Solution {
    public int divisorSubstrings(int num, int k) {
        int result = 0;
        var strings = String.valueOf(num);

        for (int i = 0; i < strings.length() - k + 1; i += 1) {
            String subString = strings.substring(i, i + k);
            int target = Integer.valueOf(subString);
            
            if (isKBeauty(num, target)) {
                result += 1;
            }
        }

        return result;
    }

    private boolean isKBeauty(int num, int target) {
        if (target == 0) {
            return false;
        }
        return num % target == 0;
    }
}
