class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListQueue {

    QueueNode front;
    QueueNode rear;

    void enqueue(int data) {

        QueueNode newNode = new QueueNode(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void dequeue() {

        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Removed: " + front.data);

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    void display() {

        QueueNode temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Queue:");
        queue.display();

        queue.dequeue();

        System.out.println("After dequeue:");
        queue.display();

        queue.dequeue();

        System.out.println("After another dequeue:");
        queue.display();
    }
}