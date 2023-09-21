import java.util.*;

interface StackOperation {
    void push(int i);
    void pop();
}

class AStack implements StackOperation {
    private int stack[] = new int[5];
    private int top = -1;
    
    public void push(int item) {
        if (top >= 4) {
            System.out.println("Overflow");
        } else {
            top++;
            stack[top] = item;
            System.out.println("Item pushed: " + stack[top]);
        }
    }
    
    public void pop() {
        if (top < 0) {
            System.out.println("Underflow");
        } else {
            System.out.println("Item popped: " + stack[top]);
            top--;
        }
    }
    
    public void display() {
        if (top < 0) {
            System.out.println("No elements in stack");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println("Element: " + stack[i]);
            }
        }
    }
}

class TestStack {
    public static void main(String args[]) {
        int ch, c;
        int i;
        AStack s = new AStack();
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Array stack");
            System.out.println("1. Push\t2. Pop\t3. Display\t4. Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            
            switch (ch) {
                case 1:
                    System.out.println("Enter the value to push:");
                    try {
                        i = sc.nextInt();
                        s.push(i);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter an integer.");
                        sc.nextLine(); // Clear the input buffer
                    }
                    break;
                case 2:
                    System.out.println("The elements are:");
                    s.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            
            System.out.println("Do you want to continue? Enter 0 to quit and 1 to continue:");
            c = sc.nextInt();
        } while (c == 1);
    }
}
