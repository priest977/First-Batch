package Opps.Inheritance.MultilevelInheritance;

public class Cat extends Dog {
    void meo(){
        System.out.println("Meo Meo Meo !!!!!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.dark();
        cat.meo();
    }
}
