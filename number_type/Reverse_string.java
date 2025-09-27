import java.util.*;

class Reverse_string{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String orignal = sc.nextLine();
        String reverse = "";

        for(int i = orignal.length()-1; i >= 0; i--){
            reverse = reverse + orignal.charAt(i);
        }
        System.out.println("Reverse a String :"+reverse);
    }
}