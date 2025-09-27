import java.util.*;

// All Methods in String in java DSA
class Methods{
    public static void main(String[]args){

        // // simple print single only 
        // String str = "Hello Methods";
        // System .out.println(str);

        // // 1.Length()
        // String str = "Abhijeet Dhanaji Kambale";
        // System.out.println("String :"+ str );
        // System.out.println("count :"+str.length());

        // // 2.charAt(index);
        // String str = "Abhijeet ";
        // System.out.println("Position of char :"+str.charAt(4));

        // // 3.substring(BeginIndex , EndIndex);
        // String str = "Abhijeet";
        // System.out.println("char:"+str.substring(1,5));

        // // 4.Equals(Str1 == str2); (Note : this type of string get boolean Output )
        // String str1 = "Abhi";
        // String str2 = "Abhi";
        // String str3 = "ABhi";
        // System.out.println(str1 == str2);   // get true output 
        // System.out.println(str1 == str3);   // get false output

        // // 5.compareTo(); => (Note : inthtis method 3 type of senarioa);
        // String str1 = "aa";
        // String str2 = "ab";
        // String str3 = "aa";
        // // this case get -1 output  "aa" < "ab"
        // System.out.println( str1.compareTo(str2));   
        // // this case get 0 output  "aa" == "aa"
        // System.out.println(str1.compareTo(str3));
        // // this case get 1 output "ab" > "aa"
        // System.out.println(str2.compareTo(str1));


        // 6.contains(); (Note : this method get bolean output on substring )
        // to check the match the Orignal string
        // String str = "Abhijeet";
        // System.out.println(str.contains("Abhi"));  // get true output
        // System.out.println(str.contains("kambale"));  // get false output

        // 7.index oof method (Note : this method s to get index of char)
        // String str = "Abhijeet";
        // System.out.println(str.indexOf('e'));
        // System.out.println(str.lastIndexOf('t')); 

        // 8.contains(String); (Note : this method s to get bolean output on substring )
        // String str = "abcdefg";
        // System.out.println(str.contains("bc"));  //get tru output
        // System.out.println(str.contains("km"));  //get false output  

        // 9.toUpperCase() and toLowerCase(); (Note : this method s to get Uppercsae and Lowercase 
        // String str1 = "TANAVI";
        // String str2 = "abhijeet";
        // System.out.println(str1.toLowerCase());
        // System.out.println(str2.toUpperCase());

        // 10.Trim(); (Note : this method  are remove the Whitespaces)
            // String str = "      Abhi      ";
            // System.out.println(str.trim());

        // 11.Replace(); (Note : this method  are to replace the string)
            // String str = "Abhinandan";
            // System.out.println(str.replace('n','t'));
            // System.out.println(str.replace('A','n'));

        // // 12.Split(); (Note : this method  are to split the string)
        //   String str = "Abhijeet Dhanaji Kambale ";
        //   System.out.println(Arrays.toString(str.split(" ")));
        

    }
}