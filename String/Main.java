package String;

public class Main {
    public static void main(String[] args) {
//        String str = "nafish"; // Local Variable
//        String str1 = "NAFISH";
//        System.out.println(str1.substring(0,3));
//        System.out.println(str1.charAt(2));
//        System.out.println(str1.indexOf('F'));
//        String upperCase = str.toUpperCase();
//        String lowerCase = str1.toLowerCase();
//        System.out.println(upperCase);
//        System.out.println(lowerCase);
//        String khan = str.concat("Khan");
//        System.out.println(" " + khan + " ");


//        String str = "abcd";
//        for(int i = 0;i<str.length();i++){
//            for(int j = i+1;j<=str.length();j++){
//                System.out.print(str.substring(i,j) + " ");
//            }
//            System.out.println();
//        }
//        String s= "abc";
//        String t= "ahgdc";
//        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s , String t){
        int indexs = 0;
        int indext = 0;
        String ans = "";
        while (indexs<s.length() && indext< t.length()){
            char chs = s.charAt(indexs);
            char cht = t.charAt(indext);
            if(chs == cht){
                ans += cht;
                indexs++;
                indext++;
            }else {
                indext++;
            }
        }
        if(ans.length() == s.length()){
            return true;
        }
        return false;
    }

}

