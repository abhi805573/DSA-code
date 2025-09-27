import java.util.*;

class Palindrome{
    public static void main(String[]args){
        int num = 4554711;
        int orignal = num;
        int digit = 0;
        int reverse = 0;

        while(num > 0){
            digit = num%10;
            reverse = reverse*10+digit;
            num = num/10;
        }
        
        if(orignal==reverse){
            System.out.println("is Palindrome :"+ orignal);
        }
        else{
            System.out.println("is not Palindrome :"+ orignal);
        }
    }
}