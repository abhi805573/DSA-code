import java.util.*;

class Basic{
    public static void main(String args[]){

        // // 1)print the all Elelmnet in array
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Value");

        // int arr[] = new int[4];
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("_______________");
        // for(int i = 0; i<arr.length; i++){
        //     System.out.println(arr[i]+"");
        // }

        // // 2) fint the length  of Number
        // int arr[] = {4,5,7,8,7,5,7};
        // System.out.println("Array Length = "+arr.length);

        // // 3) print !st and Last Element
        // int arr[] = {12,22,54,75,98};
        // System.out.println("First =  "+arr[0] +"  Last = "+arr[arr.length-1]);

        // // 4)sum of first and last
        // Scanner sc =  new Scanner(System.in);
        // System.out.println("ENTER VALUE");

        // int arr[] = new int [4];
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("_________________");
        // System.out.println("Total sum "+arr[0] + arr[arr.length-1]);

        // // 5) Reverse the array
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value");

        // int arr[] = new int[4];
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("________________");
        // for(int i = arr.length-1; i>=0; i--){
        //     System.out.println(arr[i]+"");
        // }
        

        // // 6) How many Element are  num < 5
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter avlue");

        // int arr[] = new int [4];
        // int count = 0;

        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("_____________");
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] > 5){
        //         System.out.println(arr[i]);
        //         count++;
        //     }
        // }
        // System.out.println("count = "+ count);


        // 7)count How many Element 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("ENTER VALUE");

        // int arr[] = new int[4];
        // int count = 0;
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("_______________");
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] < 10){
        //         System.out.println(arr[i]);
        //         count ++;
        //     }
        // }
        // System.out.println("Count num "+ count);


        // // 8) Find the Sum of all Element
        // Scanner sc = new Scanner(System.in);
        // System.out.println("ENTER VALUE");

        // int arr[] = new int [4];
        // int sum = 0;
        // for(int i =0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println("_______________");

        // for(int i = 0; i<arr.length; i++){
        //     sum = sum + arr[i];
        // }
        //  System.out.println("Sum of all value"+sum);


        // // 9)Find the product of all elements
        // Scanner sc = new Scanner(System.in);
        // System.out.println("ENTER VALUE");

        // int arr[] = new int[4];
        // int mul = 1;
        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        // System.out.println("___________________");

        // for(int i = 0; i<arr.length; i++){
        //     mul = arr[i] * mul;
        // }
        // System.out.println("multiply = "+mul);

        // // 10)Check if 5 is present in the array.
        // int arr[] ={1,5,7,5,5,5};
        // boolean jp = false;
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i]==5){
        //         jp = true;
        //     }
        // }
        // if(jp){
        //     System.out.println("yes");
        // }
        // else{
        //     System.out.println("NO")
        // }

        // // 11)Print the index of the last element.
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("ENTER VALUE");

        //    int arr[] = new int [4];
        //    for(int i = 0; i<arr.length; i++){
        //         arr[i] = sc.nextInt();
        //    }
        //    System.out.println("______________________");
        //    System.out.println("Index"+arr.length);

            
        // // 12) Return true if array has no elements.
        // int arr1 [] = {};
        // int arr2 [] = {1};
        // System.out.println(arr1.length == 0); //true
        // System.out.println(arr2.length == 0); //false
        
        // // 13) Change the first element to 100.
        // int arr [] ={2,3,4};
        // if(arr.length > 0){
        //     arr[0] = 100;
        // }
        // System.out.println(Arrays.toString(arr));

        // // 14) Change the last element to 0.
        // int arr [] = {2,3,4};
        // if(arr.length > 0){
        //     arr[arr.length-1] = 0;
        // }
        // System.out.println(Arrays.toString(arr));

        // // 15) Count all even numbers in array.
        // int arr[] =  {2,3,4,5};
        // int count = 0;
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] % 2 == 0){
        //         System.out.println(arr[i]);
        //         count ++;
        //     }
        // }
        // System.out.println(" Even count = "+count);

        // // 16) Count all odd numbers in array.
        // int arr[] = {2,3,4,5};
        // int count = 0;
        // for(int i = 0; i<arr.length;  i++){
        //     if(arr[i] % 2 != 0){
        //         System.out.println(arr[i]);
        //         count++;
        //     }
        // }
        // System.out.println("Odd count = "+count);

        // // 17)Print middle element if odd length, else two middle elements.
        // int arr [] = {1,2,3,4,5,6,7};
        // int n = arr.length;
        
        // if(n % 2 == 1){
        //     System.out.println(arr[n/2]);
        // }
        // else{
        //     System.out.println(arr[n/2-1] + " And " + arr[n/2]);
        // }
        

        // // 18) Multiply each element by 2.
        // int arr [] = {1,2,3};

        // for(int i = 0;  i<arr.length; i++){
        //     arr[i] = arr[i] * 2;
        // }
        // System.out.println(Arrays.toString(arr));

        // // 19) Reduce every element by 1.
        // int arr [] = {2,3,4};

        // for(int i = 0; i<arr.length; i++){
        //     arr[i] = arr[i] - 1;
        // }
        // System.out.println(Arrays.toString(arr));

        // // // 20) Check if all elements are same.
        // int arr [] = {5,1,5};
        // boolean a = true;
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i] != arr[0]){
        //         a = false;
        //     }
        // }
        // if(a){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("False");
        // }
    
    
        // // user  input and print element
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter User value");

        // int num = sc.nextInt();

        // int arr[] = new int [num];

        // for(int i = 0; i<arr.length;i++){
        // arr[i] = sc.nextInt();
        // }
        // System.out.println("_______________");

        // for(int i = arr.length-1; i>=0; i--){
        // System.out.println(arr[i]+"");
        // }

        // // comulative Example
        // int arr[] = {10,20,30,40,50};

        // for(int i = 1; i<arr.length; i++){
        //     arr[i] =  arr[i] + arr[i-1];
        // }
        // for(int i = 0; i<arr.length; i++){
        //     System.out.println(arr[i]+ "");
        // }

    






    }
}