// class Solution {
//     public int waysToSplitArray(int[] nums) {
//         int n = nums.length;

//         long[] beforeSum = new long[n];
//         beforeSum[0] = (long) nums[0];
//         for (int i = 1; i < n; i += 1) {
//             beforeSum[i] = beforeSum[i - 1] + (long) nums[i];
//         }

//         long[] afterSum = new long[n];
//         afterSum[n - 1] = (long) nums[n - 1];
//         for (int i = n - 2; i >= 0; i -= 1) {
//             afterSum[i] = afterSum[i + 1] + (long) nums[i];
//         }

//         int answer = 0;
//         for (int i = 0; i < n - 1; i += 1) {
//             if (beforeSum[i] >= afterSum[i + 1]) {
//                 answer += 1;
//             }
//         }
//         return answer;
//     }
// }

// class Solution {
//     public int waysToSplitArray(int[] nums) {
//         int n = nums.length;

//         long[] afterSum = new long[n];
//         afterSum[n - 1] = (long) nums[n - 1];
//         for (int i = n - 2; i >= 0; i -= 1) {
//             afterSum[i] = afterSum[i + 1] + (long) nums[i];
//         }

//         long[] beforeSum = new long[n];
//         int answer = 0;
//         beforeSum[0] = (long) nums[0];
//         for (int i = 0; i < n - 1; i += 1) {
//             beforeSum[i + 1] = beforeSum[i] + (long) nums[i + 1];

//             if (beforeSum[i] >= afterSum[i + 1]) {
//                 answer += 1;
//             }
//         }
//         return answer;
//     }
// }

class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] prefixSum = new long[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }
        int answer = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            long first = prefixSum[i + 1 - 1];
            long second = prefixSum[n - 1] - prefixSum[i];
            if (first >= second) {
                answer++;
            }
        }
        return answer;
    }
}