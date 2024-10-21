import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int maxUniqueSplit(String s) {
        return findMaxUniqueSubstrings(s, 0, new HashSet<>());
    }

    private int findMaxUniqueSubstrings(
        String s,
        int start,
        Set<String> uniqueSubstrings
    ) {
        // 문자열 끝에 도달했으면 0 반환
        if (start == s.length()) {
            return 0;
        }

        int maxSplits = 0;

        // 현재 위치부터 남은 문자열을 하나씩 잘라봄
        for (int i = start + 1; i <= s.length(); i++) {
            String substring = s.substring(start, i);

            // 고유한 부분 문자열인지 확인
            if (!uniqueSubstrings.contains(substring)) {
                uniqueSubstrings.add(substring); // 고유 문자열로 추가
                // 나머지 문자열에서 최대 분할 수를 구하고, 결과 갱신
                maxSplits = Math.max(maxSplits, 1 + findMaxUniqueSubstrings(s, i, uniqueSubstrings));
                uniqueSubstrings.remove(substring); // 백트래킹
            }
        }

        return maxSplits;
    }
}
