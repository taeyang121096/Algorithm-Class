package structure;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

            // 1. Initialize a stack
            Stack<Integer> stack = new Stack<>();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);

            // 2. Access elements
            System.out.println("Top element: " + stack.peek());

            // 3. Modify elements
            stack.pop();
            System.out.println("Top element after pop: " + stack.peek());

            // 4. Iterate through the stack
            System.out.print("Stack elements: ");
            for (int i = 0; i < stack.size(); i++) {
                System.out.print(stack.get(i) + " ");
            }
            System.out.println();

            // 5. Find the size of the stack
            System.out.println("Size of the stack: " + stack.size());

            // 6. Declare a stack
            Stack<Integer> newStack = new Stack<>();
            for (int i = 0; i < newStack.size(); i++) {
                System.out.print(newStack.get(i) + " ");
            }
            System.out.println();
    }
}
