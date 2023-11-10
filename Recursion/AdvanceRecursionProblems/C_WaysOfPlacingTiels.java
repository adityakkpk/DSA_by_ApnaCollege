package Recursion.AdvanceRecursionProblems;

public class C_WaysOfPlacingTiels {

    public static int placeTile(int n, int m) {
        if (n==m ) {
            return 2;
        }
        if (n<m) {
            return 1;
        }

        //Vertically
        int vPlacements = placeTile(n-m, m);

        //horizontal 
        int hPlacements = placeTile(n-1, m);

        return vPlacements+hPlacements;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTile(n, m));
    }
}
