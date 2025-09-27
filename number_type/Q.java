import java.util.*;

class Q{
    public static void main(String[]args){

        // // count the number 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value");

        // int num = sc.nextInt();
        // int count = 0;
        
        // while(num > 0){
        //     num = num /10;
        //     count ++;
        // }
        // System.out.println("Count :"+ count);


        // // 2.Revrese  NO
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a value");

        // int num = sc.nextInt();
        // int rev = 0;

        // while(num > 0){
        //     int digit = num % 10;
        //     rev = rev * 10 + digit;
        //     num = num/10;
        // }
        // System.out.println("Reverse no :"+ rev);

        // 3.palindrome
        Scaneer sc = new Scaneer(System.in);
        System.out.println("Enter a value");

        int num = sc.nextInt();
        int rev = 0;
        int org = 0;
        
        While(num > 0){
            int digit = num %10;
            rev = rev * 10 + digit;
            num = num /10;
        }
        if(rev == org){
            System.out.println("is palindrome:"+ org);
        }
        else{
            System.out.println("is NOt palindrome :"+ org);
        }




    }
}