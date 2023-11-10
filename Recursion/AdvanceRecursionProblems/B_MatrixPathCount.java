package Recursion.AdvanceRecursionProblems;

public class B_MatrixPathCount {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        System.out.println(countPaths(0, 0, row, col));
    }
    public static int countPaths(int i, int j, int n, int m) {
        if(i==n || j==m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }

        //downwards
        int downPaths = countPaths(i+1, j, n, m);

        //right
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths+rightPaths;

    }
}
