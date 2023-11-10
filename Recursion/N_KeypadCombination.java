package Recursion;

public class N_KeypadCombination {
    public static String[] keypad = {"_","*#","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String s = "45";
        printCombinations(s, 0, "");
    }
    
    public static void printCombinations(String str, int idx, String combination) {
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printCombinations(str, idx+1, combination+mapping.charAt(i));
        }
    }
}
