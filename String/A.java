import java.util.*;

class A{
    public static void main(String[]args){

        // // 1.vowels
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the String");

        // String str = sc.nextLine();
        // int count = 0;
        // for(int i =0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'i'|| ch == 'u'){
        //         System.out.println(ch);
        //         count ++;
        //     }
        // }
        // System.out.println(" Total Count :"+count);


        // 2.consonats
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string");
        
        // String str = sc.nextLine();
        // int count = 0;

        // for(int i =0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' ){
        //         System.out.println(ch);
        //         count ++;
        //     }
        // }
        // System.out.println("total count :"+count );
        
        // // 3.totl count of vowel and consonats 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string");

        // String str = sc.nextLine();
        // int vowels = 0;
        // int consonants = 0;

        // for(int i =0; i<str.length(); i++){
        //     char ch =  str.charAt(i);
        //     if("aeiou".indexOf(ch) != -1){
        //         System.out.println(ch);
        //         vowels ++;
        //     }
        //     else{
        //         System.out.println(ch);
        //         consonants++;
        //     }
        // }
        // System.out.println("vowels :"+ vowels);
        // System.out.println("consonats :"+ consonants);


        // // 4.print nnumber in string
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String");

        // String str = sc.nextLine();
        // int count = 0;

        // for(int i =0 ;i < str.length(); i++){
        //     char ch = str.charAt(i);
        //     if("123456789".indexOf(ch) != -1){
        //         System.out.println(ch);
        //         count ++;
        //     }
           
        // }
        // System.out.println("total count :"+ count);



        // // 5. print the cahr 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String");

        // String str = sc.nextLine();
        // int count = 0;

        // for(int i = 0 ; i< str.length(); i++){
        //     char ch = str.charAt(i);
        //     if("abcdefghijklmnopqrstuvwxyz".indexOf(ch) != -1){
        //         System.out.println(ch);
        //          count ++;
        //     }
        // }
        // System.out.println("total count :"+ count );


        // // 6.upper and lowercase 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a String");

        // String str = sc.nextLine();
        // StringBuilder sb = new StringBuilder();

        // for(int i = 0; i< str.length (); i++){
        //     char ch = str.charAt(i);
        //     if(ch >=  'a' && ch <= 'z'){
        //         sb.append(Character.toUpperCase(ch));
        //     }
        //     else if (ch >= 'A' && ch <= 'Z'){
        //         sb.aapnend(Character.toLowerCase(ch));
        //     }
        // }
        // System.out.println(sb.toString());


        // 7.palindrome check 
        // Scanner sc = new Scanner( System.in);
        // System.out.println("Enter a String ");
        // String str = sc.nextLine();

        // for(int i = 0; i< str.length(); i++){
        //     if(str.charAt(i) != str.charAt(str.length()-1 -i)){
        //         System.out.println("Not plaindrome");
        //     }
        // }
        // System.out.println("palindrome ");

        //   revrse the sencee  words
         String str = "the sky is Blue";
         String words [] = str.split();

         StringBuilder sb = new StringBuilder();
         for(int i =0 i< str.length(); i++){
            sb.append(new StringBuilder(words[i].rev));
            sb.append("  ");
         }
         System.out.println(sb.tostring());
        
      
        





    }
    
}