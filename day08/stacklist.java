import java.util.Scanner;

public class stacklist {

    Node head;

    // Node class
    class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Push
    void push(char data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Pop
    char pop() {
        if (head == null) {
            return '\0';
        }

        char data = head.data;
        head = head.next;

        return data;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        stacklist stack = new stacklist();

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Push every character
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop to reverse
        System.out.print("Reversed string: ");

        while (stack.head != null) {
            System.out.print(stack.pop());
        }

        sc.close();
    }
}