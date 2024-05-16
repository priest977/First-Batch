package Opps.Inheritance.Interface;


interface AnimalOne{
    void eat();
    int eat1(int a);
}
interface Pet{
    void play();
}
public class InterfaceReading implements AnimalOne,Pet {


    public static void main(String[] args) {
//        AnimalOne ans = new InterfaceReading();
//        ans.eat();
        InterfaceReading interfaceReading = new InterfaceReading();
        interfaceReading.play();
//        Pet ans = new InterfaceReading();
//        ans.play();

    }

    @Override
    public void eat() {
        System.out.println("jfsjdhfhhngfd");
    }

    @Override
    public int eat1(int a) {
        return 3;
    }

    @Override
    public void play() {
        System.out.println("hfiuhsiugfhsrdjhutgoijusdhtgjsedf");
    }
}
