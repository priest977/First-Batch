package Opps.Inheritance.SingleInheritance;

public class Animal extends Dog {
    void eat(){
        System.out.println("Animal is Eating");
    }
    void sleep(){
        System.out.println("Animal is Sleeping");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.dark();
    }
}

