class Solution {
    private final static String KIM = "Kim";
    public String solution(String[] seoul) {
        String index = "";
        for (int i = 0; i < seoul.length; i += 1){
            if (seoul[i].equals(KIM)) {
                index = String.valueOf(i);
                break;
            }
        }
        return "김서방은 " + index + "에 있다";
    }
}