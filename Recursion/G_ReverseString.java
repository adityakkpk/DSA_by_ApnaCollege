package Recursion;

public class G_ReverseString {
    public static void main(String[] args) {
        String s = "Aditya";
        int idx = s.length()-1;
        reverseString(s, idx);
    }

    public static void reverseString(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(str, idx-1);
    }
}
