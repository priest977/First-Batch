package Opps;

public class StaticReading {
   public static int count = 0; // static  variable

   public StaticReading() {
      count++;
   }

   // static method
   static int multiply(int a , int b){
      return a*b;
   }

   // static block
   static {
      System.out.println("Static Block  !!!!!");
   }

   public static void main(String[] args) {
      StaticReading staticReading = new StaticReading();
      System.out.println(multiply(7,8));
   }
}
