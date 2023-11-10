package Recursion;

public class L_SubSequenceOfString {
    public static void main(String[] args) {
        String str = "abc";
        subSequence(str, 0, "");
    }

    public static void subSequence(String str, int idx, String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }

        char currChar = str.charAt(idx);

        //to be add
        subSequence(str, idx+1, newstring+currChar);

        //or not to be add
        subSequence(str, idx+1, newstring);
    }
}
