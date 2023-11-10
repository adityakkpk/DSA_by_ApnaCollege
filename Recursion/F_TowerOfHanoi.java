package Recursion;

public class F_TowerOfHanoi {
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "S", "H", "D");
    }
    //Time Complexity= O(2^n - 1) = O(2^n)
    public static void towerOfHanoi(int n, String src, String helper, String des){
        //Base Case
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+des);
            return;
        }

        towerOfHanoi(n-1, src, des, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+des);

        towerOfHanoi(n-1, helper, src, des);

    }
}
