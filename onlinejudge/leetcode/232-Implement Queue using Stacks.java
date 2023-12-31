class MyQueue {
    Stack<Integer> main;
    Stack<Integer> sub;

    public MyQueue() {
        main = new Stack<>();
        sub = new Stack<>();
    }
    
    public void push(int x) {
        main.push(x);
    }
    
    public int pop() {
        int target = 0;
        while (!main.isEmpty()) {
            int element = main.pop();

            if (main.isEmpty()) {
                target = element;
                break;
            }
            sub.push(element);
        }
        while (!sub.isEmpty()) {
            int element = sub.pop();
            main.push(element);
        }
        return target;
    }
    
    public int peek() {
        int target = 0;
        while (!main.isEmpty()) {
            int element = main.pop(); // 1, 2, 3, 4, 5
            sub.push(element);

            if (main.isEmpty()) {
                target = element;
            }
        }
        while (!sub.isEmpty()) {
            int element = sub.pop();
            main.push(element);
        }
        return target;
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */