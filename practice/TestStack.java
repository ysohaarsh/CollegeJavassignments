import java.util.Scanner;

interface StackOperation {
    void push(int element) throws StackOverflowException;
    int pop() throws StackUnderflowException;
}

class StackOverflowException extends Exception {
    public StackOverflowException(String message) {
        super(message);
    }
}

class StackUnderflowException extends Exception {
    public StackUnderflowException(String message) {
        super(message);
    }
}

class AStack implements StackOperation {
    private int[] stackArray;
    private int top;
    private int capacity;

    public AStack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int element) throws StackOverflowException {
        if (top == capacity - 1) {
            throw new StackOverflowException("Stack is full. Cannot push element.");
        }
        stackArray[++top] = element;
    }

    public int pop() throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Stack is empty. Cannot pop element.");
        }
        return stackArray[top--];
    }

    public void display() {
        System.out.println("Elements in the stack:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }
}

public class TestStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the stack: ");
        int capacity = scanner.nextInt();
        AStack stack = new AStack(capacity);

        while (true) {
            System.out.println("Stack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to push: ");
                        int element = scanner.nextInt();
                        stack.push(element);
                        System.out.println("Element pushed successfully.");
                        break;
                    case 2:
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                        break;
                    case 3:
                        stack.display();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (StackOverflowException e) {
                System.out.println("Stack Overflow: " + e.getMessage());
            } catch (StackUnderflowException e) {
                System.out.println("Stack Underflow: " + e.getMessage());
            }
        }
    }
}
