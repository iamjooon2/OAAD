import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();

        // 에러 케이스인지 먼저 검사
        if (isError(input)) {
            System.out.println("Error!");
            return;
        }

        // C 스타일(snake_case) → Java 스타일
        if (isCppStyle(input)) {
            System.out.println(toCamel(input));

        // Java 스타일(camelCase) → C 스타일
        } else if (isJavaStyle(input)) {
            System.out.println(toSnake(input));

        // 모두 소문자(cpp도 아니고 java도 아님) → 그대로 출력
        } else {
            System.out.println(input);
        }
    }

    // “Error!”를 출력해야 하는 케이스
    private static boolean isError(String s) {
        // 빈 문자열 처리
        if (s.isEmpty()) return true;
        // 맨 앞이 대문자거나, 언더스코어로 시작/끝
        if (Character.isUpperCase(s.charAt(0)) 
            || s.charAt(0) == '_' 
            || s.charAt(s.length() - 1) == '_') {
            return true;
        }
        // 연속 언더스코어
        if (s.contains("__")) {
            return true;
        }
        // C 스타일·Java 스타일 혼합 (언더스코어와 대문자가 동시에 존재)
        boolean hasUnder = s.contains("_");
        boolean hasUpper = s.chars().anyMatch(Character::isUpperCase);
        if (hasUnder && hasUpper) {
            return true;
        }
        return false;
    }

    // 완전 소문자 & 언더스코어 없음 → C 스타일 후보
    private static boolean isCppStyle(String s) {
        return s.contains("_") && s.equals(s.toLowerCase());
    }

    // 언더스코어 없음 & 첫 글자 소문자 & 대문자 하나 이상 → Java 스타일 후보
    private static boolean isJavaStyle(String s) {
        if (s.contains("_")) return false;
        if (!Character.isLowerCase(s.charAt(0))) return false;
        // 한 글자만 있을 때도 모두 소문자면 isJavaStyle=false → 그대로 출력 케이스로 간다
        return s.chars().anyMatch(Character::isUpperCase);
    }

    // snake_case → camelCase
    private static String toCamel(String s) {
        StringBuilder sb = new StringBuilder();
        boolean nextUpper = false;
        for (char c : s.toCharArray()) {
            if (c == '_') {
                nextUpper = true;
            } else {
                if (nextUpper) {
                    sb.append(Character.toUpperCase(c));
                    nextUpper = false;
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    // camelCase → snake_case
    private static String toSnake(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append('_');
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

