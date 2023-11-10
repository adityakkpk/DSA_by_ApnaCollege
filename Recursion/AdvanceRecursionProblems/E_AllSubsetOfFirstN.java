package Recursion.AdvanceRecursionProblems;

import java.util.ArrayList;

public class E_AllSubsetOfFirstN {
    public static void findSubSets(int n, ArrayList<Integer> subset){
        if(n==0){
            System.out.println(subset);
            return;
        }

        //add
        subset.add(n);
        findSubSets(n-1, subset);

        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubSets(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubSets(n,subset);
    }
}
