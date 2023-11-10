package Recursion.AdvanceRecursionProblems;

public class D_InvitePeople {
    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }

        //single
        int singleGuest = callGuests(n-1);

        //pair
        int pairGuests = (n-1)*callGuests(n-2);

        return singleGuest+pairGuests;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total Type of calling the guests:"+ callGuests(n));
    }
}
