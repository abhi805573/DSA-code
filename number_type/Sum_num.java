import java.util.*;

class Sum_num{
    public static void main(String[]args){
        int num = 123456;
        int sum = 0;

        while(num > 0){
            int digit = num%10;
            sum += digit;
            num = num/10;
        }

        System.out.println("Sum of number :"+ sum);
    }
}