import java.util.*;

class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack: " + stack);

        // Pop elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Peek at the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        System.out.println("Stack after peek: " + stack);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Search for an element in the stack
        int searchElement = 2;
        int position = stack.search(searchElement);
        System.out.println(searchElement + " found at position: " + position);
    }
}
