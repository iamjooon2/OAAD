class Solution {
    public int[] solution(String[] wallpaper) {
        int top = 51;
        int left = 51;
        int right = -1;
        int bottom = -1;
        
        int lineIndex = 0;
        for (String line : wallpaper) {
            String[] element = line.split("");
            for (int i = 0; i < element.length; i += 1) {
                if (element[i].equals("#")) {
                    left = Math.min(left, lineIndex);
                    right = Math.max(right, lineIndex + 1);
                    top = Math.min(top, i);
                    bottom = Math.max(bottom, i + 1);
                }
            }
            lineIndex++;
        }

        int[] answer = {left, top, right, bottom};
        return answer;
    }
}
