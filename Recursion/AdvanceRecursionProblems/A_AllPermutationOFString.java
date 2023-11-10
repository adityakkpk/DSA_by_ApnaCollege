package Recursion.AdvanceRecursionProblems;

public class A_AllPermutationOFString {
    //Time complexity = O(n!) 
    //For calculating the all permutation of n, simply calculate the facorial of n.
    public static void main(String[] args) {
        String s = "abc";
        printAllPermutations(s, "");
    }
    public static void printAllPermutations(String str, String permutation) {
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printAllPermutations(newString, permutation+currchar);
        }
    }
}
