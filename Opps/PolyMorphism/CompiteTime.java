package Opps.PolyMorphism;

public class CompiteTime {
    int a;
    int b;

//    public CompiteTime(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }


    int cal1(int a , int b){
        return a+b;
    }
    int cal1(int a , int b , int c){
        return a+b+c;
    }
    double cal1(double a , double b){
        return a*b;
    }

    public static void main(String[] args) {
        CompiteTime compiteTime = new CompiteTime();
        System.out.println(compiteTime.cal1(4,5));
        System.out.println(compiteTime.cal1(1,2,3));
        System.out.println(compiteTime.cal1(2.2,3.7));
    }
}
