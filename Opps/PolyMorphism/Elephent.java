package Opps.PolyMorphism;

public class Elephent extends Animal {
    @Override // annotation
    public void makeSound(){
        System.out.println("Chihadna!!!!!");
    }

    public static void main(String[] args) {
        Elephent elephent = new Elephent();
        Animal horse = new Horse();
        elephent.makeSound();
        horse.makeSound();
        elephent.makeSound();
        elephent.makeSound();
        elephent.makeSound();
    }
}
