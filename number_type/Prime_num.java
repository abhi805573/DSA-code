import java.util.*;

class Prime_num{
    public static void main(String[]args){
        int num = 7;
        boolean isprime = true  ;

        for(int i = 2; i<num ;i++){
            if(num % i ==0){
                isprime = false;
                break;
            }
        }
        if(isprime == true){
            System.out.println("is Prime :"+ num);
        }
        else{
            System.out.println("is not Prime :"+ num);
        }
    }
}