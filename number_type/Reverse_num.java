import java.util.*;

class Reverse_num{
    public static void main(String[]args){
        int num = 50234;
        int digit = 0;
        int reverse = 0;

        while(num > 0){
            digit = num%10;
            reverse = reverse*10+digit;
            num = num/10;
        }
        System.out.println("Reverse the number :"+reverse);
    }
}