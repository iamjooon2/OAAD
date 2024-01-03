/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;    

            if (isBadVersion(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return start;
    }
}

// 시간 초과 버전
// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//         int answer = 1;
//         for (int i = 1; i <= n; i++) {
//             if (isBadVersion(i)) {
//                 answer = i;
//                 break;
//             }
//         }
//         return answer;
//     }
// }
