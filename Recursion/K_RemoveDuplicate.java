package Recursion;

public class K_RemoveDuplicate {
    public static boolean[] map = new boolean[26];
    public static void main(String[] args) {
        String s = "abbccdda";
        removeDuplicates(s, 0, "");
    }

    private static void removeDuplicates(String str, int idx, String newString) {
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[(currChar - 'a')] == true){
            removeDuplicates(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx, newString);
        }
    }
}
