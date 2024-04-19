package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ist Way
//        int [] arr1 = {10,20,30,40,50};
//        System.out.println(arr1[3]);

//        int i = 10 ;
//        System.out.println(i);
        // 2nd Way
//        int [] arr2 = new int[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The Size : ");
//        int userInput = sc.nextInt();
//        int [] arr = new int[userInput];
//        for(int i = 0; i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = 0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    int [] arr = {1,2,3,4,5,6};
//
//    reverseArray(arr);
//    printArray(arr);
//    reverseArray(arr);

//    int [] arr = {8,1,5,6,0,2};
//    System.out.println(findMinElement(arr));

//        int [] arr = {1,4,0,6,9};
////        System.out.println(Arrays.toString(arr));
//        int target = 12;
//        System.out.println(Arrays.toString(twoSum(arr,target)));

//        int [] arr = {8,1,5,6,0,2};
////        secondMin(arr);
//        System.out.println( secondMax(arr));
//        int [] arr = {7,1,5,3,6,4};
//        System.out.println(maxProfit(arr));

        int [] arr  = {-1,-100,4,99};
        rightRotate(arr,2);
        printArray(arr);

    }
    public static void secondMin(int [] arr){
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<=min){
                smin = min;
                min = arr[i];
            }else if(arr[i]<smin){
                smin = arr[i];
            }
        }
        System.out.println("Second Min Value : " + smin);
    }
    public static int secondMax(int [] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=max){
                smax = max;
                max = arr[i];
            }else if(arr[i]>smax){
                smax = arr[i];
            }
        }
        return  smax;
    }
    public static void rightRotate(int [] arr , int k){
        k = k % arr.length;
        int help = arr.length - k;
        reverseArrayForRightRotate(arr,0,help-1);
        reverseArrayForRightRotate(arr,help,arr.length-1);
        reverseArrayForRightRotate(arr,0,arr.length-1);
    }
    public static void reverseArrayForRightRotate(int [] arr , int start , int end){
        while (start<=end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static int maxProfit(int [] arr){
        int profit = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }
        return profit;
    }
    public static int [] twoSum(int [] arr , int target){
        for(int i = 0 ; i< arr.length;i++){
            for(int j =i+1; j< arr.length;j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{arr[i],arr[j]};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int findMinElement(int [] arr){
        int wasim = 0;
        int nafish = wasim +1;
        for(int i = 0;i<arr.length;i++){
            if(arr[wasim]>arr[nafish]){
                arr[wasim] = arr[nafish];
            }
        }
        return wasim;
    }
    public static void reverseArray(int [] arr){
        int amir = 0;
        int saif = arr.length-1;
        while (amir<=saif){
            swap(arr,amir,saif);
            amir++;
            saif--;
        }
    }
    public static void swap(int [] arr , int amir , int saif){
        int temp = arr[amir];
        arr[amir] = arr[saif];
        arr[saif] = temp;
    }
    public static void printArray(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
