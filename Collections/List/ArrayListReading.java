package Collections.List;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListReading {
    public static void main(String[] args) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        List<Integer> ans = new ArrayList<>();
//        ans.add(1);
//        ans.add(2);
//        ans.add(3);
//        ans.add(4);
//        System.out.println(ans);
//        for(var finalAns : ans){
//            if((finalAns %2 == 0)){
//                System.out.println(finalAns);
//            }
//        }
//        ans.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
//        List<Integer> collect1 = ans.stream().map(n -> n + 1).collect(Collectors.toList());
//        System.out.println(collect);
//        System.out.println(collect1);


//
//        List<Integer> arrayList = Arrays.asList(1,2,3,4,5,6,7);
//        System.out.println(arrayList.contains(1));
////        arrayList.remove(1);
////        System.out.println(arrayList.remove(3));
//        System.out.println(arrayList);


//        List<String> ans1 = new ArrayList<>();
//        ans1.add("Nafish");
//        ans1.add("Ehsanul");
//        ans1.add("tabrej");
//        ans1.add("saif");
//        ans1.add("Aamir");
//        System.out.println(ans1.get(4));
//        System.out.println(ans1);

//
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
//        List<Integer> list2 = Arrays.asList(7,8,5,3,1);
//        List<List<Integer>> finalList = Arrays.asList(list1,list2);
//        finalList.stream().flatMap(n->n.stream().filter(x->x%2==1)).forEach(System.out::println);


   ArrayList<Integer> list = new ArrayList<>();
   list.add(2);
   list.add(0);
//   list.add(2);
   list.add(1);
//   list.add(1);
//   list.add(0);
   sort012(list);
   System.out.println(list);
    }

    static void sort012(ArrayList<Integer> list){
        int i = 0;
        int j = 0;
        int k = list.size()-1;
        while (i<=k){
            if(list.get(i)==0){
                int temp = list.get(i);
                list.set(i,list.get(j));
                list.set(j,temp);
                i++;
                j++;
            }else if(list.get(i) == 1){
                i++;
            }else {
                int temp = list.get(i);
                list.set(i,list.get(k));
                list.set(k,temp);
                k--;
            }
        }
    }
}
