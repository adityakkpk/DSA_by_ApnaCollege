package Recursion;

public class J_MoveAllXtoEnd {
    public static void main(String[] args) {
        String s = "axbcxxxd";
        moveX(s, 0, 0, "");
    }

    public static void moveX(String str, int i, int count, String newString){
        if(i == str.length()){
            for (int j = 0; j < count; j++) {
                newString += "x";
            }
            System.out.println(newString);
            return;
        }

        
        if(str.charAt(i) == 'x'){
            count++;
            moveX(str, i+1, count, newString);
        }
        else{
            newString = newString + str.charAt(i);
            moveX(str, i+1, count, newString);
        }
    }
}
