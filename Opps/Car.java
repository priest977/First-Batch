package Opps;

class Car {
    String color; // Instance variable
    String model;
    String engine;
    // Constructor
    public Car(String color, String model , String engine) {
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    // Method
    public void displayInfo(){
        System.out.println("Car Color : "+ color + "Car Model : "+ model + " Car Engine  : "  + engine);
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "color='" + color + '\'' +
//                ", model='" + model + '\'' +
//                ", engine='" + engine + '\'' +
//                '}';
//    }

    public static void main(String[] args) {
        Car car1 = new Car("Red","Toyata","Petrol");
        System.out.println(car1.toString());
//        car1.displayInfo();
        Car car2 = new Car("White","Alto","Diesel");
//        car2.displayInfo();

//        Employee employee = new Employee("Ehsanul",25,60000,"Trainee Engineer");
//        employee.display();
    }
}
