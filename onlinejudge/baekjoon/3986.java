public class Main {

    static int N;
    static int count = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            String word = scan.next();

            Stack<Character> stack = new Stack<>();
            for (char alphabet : word.toCharArray()) {
                if (stack.isEmpty()) {
                    stack.push(alphabet);
                } else if (stack.peek().equals(alphabet)) {
                    stack.pop();
                } else {
                    stack.push(alphabet);
                }
            }

            if (stack.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
