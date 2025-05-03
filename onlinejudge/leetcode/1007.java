class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        Map<Integer, Integer> topMap = new HashMap<>();
        Map<Integer, Integer> bottomMap = new HashMap<>();

        int n = tops.length;

        for (int i = 0; i < n; i += 1) {
            topMap.put(tops[i], topMap.getOrDefault(tops[i], 0) + 1);
            bottomMap.put(bottoms[i], bottomMap.getOrDefault(bottoms[i], 0) + 1);
        }
    
        int topMaxKey = 0;
        int topMaxValue = 0;
        for (var entry: topMap.entrySet()) {
            if (entry.getValue() > topMaxValue) {
                topMaxKey = entry.getKey();
                topMaxValue = entry.getValue();
            }
        }
        int bottomMaxKey = 0;
        int bottomMaxValue = 0;
        for (var entry: bottomMap.entrySet()) {
            if (entry.getValue() > bottomMaxValue) {
                bottomMaxKey = entry.getKey();
                bottomMaxValue = entry.getValue();
            }
        }

        int maxFrequencyKey = bottomMaxValue >= topMaxValue ? bottomMaxKey : topMaxKey;

        int topCount = 0;
        int bottomCount = 0;
        for (int i = 0; i < n; i += 1) {
            if (!(tops[i] == maxFrequencyKey || bottoms[i] == maxFrequencyKey)) {
                return -1;
            }

            if (tops[i] != maxFrequencyKey) {
                topCount += 1;
            } else if (bottoms[i] != maxFrequencyKey) {
                bottomCount += 1;
            }
        }
        
        return topCount > bottomCount ? bottomCount : topCount;
    }
}
