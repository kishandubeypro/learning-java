import java.util.*;

public class QueueExample {
    int[] queue = new int[5];
    int front = 0;
    int rear = -1;

   
    void enqueue(int data) {
        if (rear == queue.length - 1) {
            System.out.println("Queue is Full");
            return;
        }

        rear++;
        queue[rear] = data;
    }

    
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Removed: " + queue[front]);
        front++;
    }

   
    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueExample q = new QueueExample();

        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);

        q.display();

        q.dequeue();

        q.display();
    }
}

