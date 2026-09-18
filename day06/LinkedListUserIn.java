import java.util.Scanner;

class LinkedListUserIn{

    static Node head;

    void insert(int data, int position){

        Node newnode = new Node(data);

        if(position == 1){
            newnode.next = head;
            head = newnode;
            return;
        }

        Node temp = head;

        for(int i=1; i<position-1; i++){
            if(temp == null){
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Invalid position");
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    void display(){

        if(head == null){
            System.out.println("Linked list is empty");
        }else{

            Node temp1 = head;

            System.out.println("Linked list till now");

            while(temp1 != null){
                System.out.println(temp1.data + " ");
                temp1 = temp1.next;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedListUserIn ob = new LinkedListUserIn();

        System.out.print("Enter the position where you want to insert: ");
        int position = sc.nextInt();

        System.out.print("Enter the data: ");
        int data = sc.nextInt();

        ob.insert(60, 3);

        ob.display();
    }
}