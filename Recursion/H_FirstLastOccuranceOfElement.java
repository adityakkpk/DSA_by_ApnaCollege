package Recursion;

public class H_FirstLastOccuranceOfElement {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String s, int i, char element){
        if(i==s.length()){
            System.out.println(first);
            System.out.println(last);
            // System.out.println("First position: "+(first+1));
            // System.out.println("Last position: "+(last+1));
            return;
        }

        char ch = s.charAt(i);
        if(ch == element){
            if(first == -1){
                first = i;
            }else{
                last = i;
            }
        }

        findOccurance(s, i+1, element);
    }
    public static void main(String[] args) {
        String str = "aditya";

        findOccurance(str, 0, 'a');
    }
}
