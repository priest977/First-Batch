package Opps;

public class Employee {
    private String name;
   private  int age;
   private  double salary;
   private  String designation;
    // parametries
    public Employee(String name, int age, double salary, String designation) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    private void display(){
        System.out.println(name + age + salary + designation);
    }

   public static void main(String[] args) {
        Employee nafish = new Employee("67",27,50000,"Software Engineer");
        nafish.display();

       Employee Saif = new Employee("Saif",23,5000,"Assocaite Engineer");
       Saif.display();
//
//        Car car = new Car("Red","Alto","Diesel");
//        car.displayInfo();

//       DefConstructor defConstructor = new DefConstructor();
//       defConstructor.setName2("Nafish");
//       System.out.println(defConstructor.getName2());
    }
}
