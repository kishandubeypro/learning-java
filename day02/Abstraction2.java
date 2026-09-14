package day02;

public class Abstraction2  extends Abstraction{
    void start(){
        System.out.println("the car started");

    }
    void display(){
        System.out.println("Abstraction implemented");

    }
    public static void main(String[]args){
        Abstraction2 ob=new Abstraction2();
        ob.start();
        ob.display();
        ob.disp();
    }

    
}
