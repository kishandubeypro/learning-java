package day01;

public class animal {

    String name;
    String breed;
    int age;
    int noOfAnimals;

    public void setItem(String name,String breed,int age ,int noOfAnimals){
        this.name=name;
        this.age=age;
        this.breed=breed;
        this.noOfAnimals=noOfAnimals;        
    }

    public void getItem(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(breed);
        System.out.println(noOfAnimals);

    }

    public static void main(String[] args){
        animal a = new animal();
        a.setItem("horse", "something", 9, 90);
        a.getItem();
    }

    
    
}
