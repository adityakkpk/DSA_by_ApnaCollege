import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bit: ");
        int opr = sc.nextInt();
        sc.close();
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;

        if(opr == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
