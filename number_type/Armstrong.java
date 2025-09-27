import java.util.*;

class Armstrong{
    public static void main(String[]args){
        int num = 464;
        int orignal = num;
        int result = 0;
        int n = 0;

        int temp = num;
        while(temp != 0){
            temp = temp/10;
            n++;
        }

        temp = num;

        while(temp != 0){
            int digit = temp%10;
            result += Math.pow(digit,n);
            temp = temp/10;
        }

        if(orignal == result){
            System.out.println("is Armstrong :"+ num);
        }
        else{
            System.out.println("is Not  Armstrong :"+ num);
        }
    }
}