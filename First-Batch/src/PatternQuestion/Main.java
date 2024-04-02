package PatternQuestion;

public class Main {
    public static void main(String[] args) {
//        printTable(10); // student
//        printTable(5); // family
//        printTable(2); // bete
        printPattern(8);
//        print(3);
    }
    public static void printTable(int n){
        int i;
        for(i = 1;i<=10;i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }

    public static void printPattern(int n){
        for(int i = 1;i<=n;i++){ // 3 1 2 3
            for(int j = 1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void print(int n){
       for(int i = 1; i<= n;i++){
           System.out.println(i);
       }
    }

}
