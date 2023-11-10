package Recursion;

public class B_Recursion {
    public static void main(String[] args) {
        int n =1;
        printNumber(n);
    }
    public static void printNumber(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printNumber(n+1);
    }
}
