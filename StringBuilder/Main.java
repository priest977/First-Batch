package StringBuilder;

public class Main {
    public static void main(String[] args) {
//        String a ;
//        a = "Mello";
//        a = "Gello";
//        System.out.println(a.contains("Tello"));
//        System.out.println(a);
//
//        // Declared
//        StringBuilder s = new StringBuilder();
//        s.append("Hello");
//        s.append(",");
//        s.append("World");
//        s.insert(1,"Seraj");
//        s.delete(1,6);
//        s.replace(1,6,"Seraj");
//        System.out.println(s);


//        String str = "nafish";
//        System.out.println(reverseStringByStringBuilder(str));
//
//        String str = "my name is groot";
//        System.out.println(reverseEachCharacterInString(str));

//        String s1 = "abcde";
//        String s2 = "abce";
//        System.out.println(checkRotation(s1,s2));
    }

    // reverse String
    public static String reverseStringByStringBuilder(String str){
        StringBuilder rev = new StringBuilder();
        rev.append(str);
        rev.reverse();
        return rev.toString();
    }

    public static String reverseEachCharacterInString(String str){
        String ans = "";
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                temp.append(ch);
            }else {
                temp.reverse();
                ans += temp;
                ans += " ";
                temp = new StringBuilder();
            }
        }
        temp.reverse();
        ans += temp;
        return ans;
    }

    public static boolean checkRotation(String s1 , String s2){
        if(s1.length() != s2.length()) return false;
        String ans = s1 + s1;
        return ans.contains(s2);
    }
}
