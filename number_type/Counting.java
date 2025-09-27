import java.util.*;

class Counting{
    public static void main(String[]args){
        int num = 654845;
        int count = 0;

        while(num > 0){
            num = num/10;
            count++;
        }
        System.out.println("counting :"+count);
    }
}