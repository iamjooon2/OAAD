class Solution {

    static final int ONE_DAYS_TO_MINUTE = 1440;

    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();
        for (String timePoint : timePoints) {
            minutes.add(toMinute(timePoint));
        }
        
        if (hasSameTime(minutes)) {
            return 0;
        }
        
        Collections.sort(minutes);
        
        int minGap = Integer.MAX_VALUE;
        for (int i = 0; i < minutes.size() - 1; i++) {
            minGap = Math.min(minGap, minutes.get(i + 1) - minutes.get(i));
        }
        
        int circularGap = ONE_DAYS_TO_MINUTE - (minutes.get(minutes.size() - 1) - minutes.get(0));
        
        return Math.min(minGap, circularGap);
    }

    private int toMinute(String timePoint) {
        String[] arr = timePoint.split(":");
        int hours = Integer.parseInt(arr[0]) * 60;
        int minutes = Integer.parseInt(arr[1]);
        return hours + minutes;
    }

    private boolean hasSameTime(List<Integer> minutes) {
        Set<Integer> uniqueMinutes = new HashSet<>(minutes);
        return uniqueMinutes.size() != minutes.size();
    }
}
