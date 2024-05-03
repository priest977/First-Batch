package Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int [] arr = {8,12,1,6,5,2};
//       bubbleSort(arr);
//       System.out.println(Arrays.toString(arr));
//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));

//        insertionSort(arr);
//        System.out.println(Arrays.toString(arr));

        int [] a= {1,3,5,7};
        int [] b = {2,4,6,8};
        System.out.println(Arrays.toString(mergeTwoSortedArray(a,b)));
    }

    static void bubbleSort(int [] arr){
        for(int i = arr.length-1;i>=1;i--){
            for(int j = 1;j<=i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    static void selectionSort(int [] arr){
        for(int i = 0;i<arr.length;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    static void insertionSort(int [] arr){
        for(int i = 1;i<arr.length;i++){
            for(int j = i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    static int [] mergeTwoSortedArray(int [] a , int [] b){
        int [] mergerArray = new int[a.length + b.length];
        int ai = 0;
        int bi = 0;
        int mergerK = 0;
        while (ai<a.length && bi<b.length){
            if(a[ai]<b[bi]){
                mergerArray[mergerK] = a[ai];
                mergerK++;
                ai++;
            }else {
                mergerArray[mergerK] = b[bi];
                mergerK++;
                bi++;
            }
        }
        while (ai<a.length){
            mergerArray[mergerK] = a[ai];
            mergerK++;
            ai++;
        }
        while (bi<b.length){
            mergerArray[mergerK] = b[bi];
            mergerK++;
            bi++;
        }
        return mergerArray;
    }

    static void swap(int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
