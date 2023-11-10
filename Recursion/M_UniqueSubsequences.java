package Recursion;

import java.util.HashSet;

public class M_UniqueSubsequences {
    public static void main(String[] args) {
        String s = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqSubSequences(s, 0, "", set);
    }

    public static void uniqSubSequences(String str, int idx, String newstring, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newstring)){
                return;
            }else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }

        char currChar = str.charAt(idx);

        //to be add
        uniqSubSequences(str, idx+1, newstring+currChar, set);

        //or not to be add
        uniqSubSequences(str, idx+1, newstring, set);
    }
}
