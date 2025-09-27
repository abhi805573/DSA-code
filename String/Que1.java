import java.util.*;

// Que 1.  vowels /Cosonants/count
class Que1{
    public static void main(String []args){

        // //1. print  the vowel  and their count
        // String str = "abcdefghiu";
        // int count = 0;
        // for(int i = 0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u'){
        //         System.out.println(ch);
        //         count++;
        //     }
        // }
        // System.out.println("total count :"+count);


        // // 2.print the consonants and their count
        // String str = "abcdefghi";
        // int count = 0;
        // for(int i = 0; i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
        //         System.out.println(ch);
        //         count++;
        //     }
        // }
        // System.out.println("total count :"+count);


        // // 3.total count vowels/consonats with print by indexof method
        // String str  = "abcdefghi";
        // int vowels = 0;
        // int consonats = 0;

        // for(int i = 0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if("aeiou".indexOf(ch) != -1){
        //         System.out.println(ch);
        //         vowels++;
        //     }
        //     else{
        //         System.out.println(ch);
        //         consonats++;
        //     }
        // }
        // System.out.println("total vowels :"+vowels);
        // System.out.println("total consonants :"+consonats);


        // // 4.print the  number in string  by indexOf method
        // String str = "abc123cd567bdjn";
        // int count = 0;
        // for(int i = 0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if("123456789".indexOf(ch) != -1){
        //         System.out.println(ch);
        //         count++;
        //     }
        // }
        // System.out.println("tottal count :"+count);

        
        // // 5.print the char in String  by indexOf method
        // String str = "abcd123dh774n";
        // int count = 0;
        // for(int i = 0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if("abcdefghijklmnopqrstuvwxyz".indexOf(ch) != -1){
        //         System.out.println(ch);
        //         count++;
        //     }
        // }
        // System.out.println("total count :"+count);

        
        // // 6.upperCase and LowerCase  by String Builder
        // String str = "aBhijk";

        // StringBuilder sb = new StringBuilder();

        // for(int i = 0; i<str.length(); i++){
        //     char ch = str.charAt(i);
        //     if(ch >= 'a' && ch <= 'z'){
        //         sb.append(Character.toUpperCase(ch));
        //     }
        //     else if(ch >= 'A' && ch <= 'Z'){
        //         sb.append(Character.toLowerCase(ch));
        //     }
        // }
        // System.out.println(sb.toString());

        // // 7.Revrese the String 
        // String str = "NiharikA";
        // StringBuilder sb = new StringBuilder(str);
        // sb.reverse();
        // System.out.println(sb.toString());


        // //8. Palindrome check
        // String str = "madam";

        // for(int i = 0; i<str.length(); i++){
        //     if(str.charAt(i) != str.charAt(str.length()-1-i)){
        //         System.out.println("Not Plindrome");
        //     }
        // }
        // System.out.println("Palindrome");

        
        // // 9. =>1. simple revrse String by method SyringBuilder
        // String str = "Satara";
        // StringBuilder sb = new StringBuilder(str);
        // sb.reverse();
        // System.out.println(sb.toString());

        // // 9.=> 2.reverse String  by Scanner
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the String :");
        // String org = sc.nextLine();
        // String rev = "";

      
        // for(int i = org.length()-1; i>= 0; i--){
        //     rev = rev + org.charAt(i);
        // }
        // System.out.println("reverse :"+rev);

        
        // 10. reverse the each char in string
        String str = "the sky is blue";
        String words [] = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i =0; i < words.length; i++){
            sb.append(new StringBuilder(words[i]).reverse());
            sb.append(" ");
        }
        System.out.println(sb.toString());


        

      

    
       
    

        
     

        
   
    
       
    
       

     
      
      

     
       

     
       
       
        
   
    
    
        
        

      
      

        

        
    }
}