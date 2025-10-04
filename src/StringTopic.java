import java.util.Arrays;

public class StringTopic {
    static void main() {
        String s = "Rachana";
        String s3 = "Pandey";
        String s1 = new String("Rachana");
        if (s == s1) {
        }
        System.out.println("Hey");

        // length() - returns the length of the string (Number of characters)

        int len = s1.length();
        System.out.println(len);
        System.out.println("Rachana1".length());

        //concat() - joining strings

        System.out.println(s + s1);
        System.out.println(s.concat(s1));
        System.out.println(s.concat(s1).concat(s3));
        System.out.println(s.concat(s1+s3));
        System.out.println("Welcome".concat(" to my house "));

        //trim() - It will remove spaces from right and left side

        String str1 = "    I am doing good in Automation    ";
        System.out.println("Before Triming : " + str1);
        System.out.println("Before Triming length : " + str1.length());
        System.out.println("After Triming : " +  str1.trim().length());
        System.out.println("After Triming length : " +  str1.trim());

        // charAt() - returns the character of the string based on index
        // index start from 0

        String strr = "Happy";
        System.out.println(strr.charAt(3));
        System.out.println(strr.charAt(0));


        // contains() - returns true or false

        System.out.println(strr.contains("py"));
        System.out.println(strr.contains("PY"));

        //equals and //equalsIgnorecase = Compare Strings

        String st1 = "Rachana";
        String st2 = "Rachana";

        System.out.println(st1.equals(st2));
        System.out.println(st1.equals("rachana"));
        System.out.println(st1.equalsIgnoreCase("rachana"));
        System.out.println(st1 == st2);


        // replace() - replace single or multiple sequence of characters in strings
        st1 = "Welcome to selenium java selenium and java and c# and c++ or c selenium";
        System.out.println(st1.replace('e','X'));
        System.out.println(st1.replace("selenium","playwrite"));

        //substring() - extract substring from main string
        // starting index = 0
        // ending index = 1
         //   01234567
        s1 = "selenium";
        System.out.println(s1.substring(0,3));
        System.out.println(s1.substring(0,6));

        // toUpperCase()  //toLowerCase()
        s = "rAcHaNaPaNdEy";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // split() - split based on multiple parts based on delimeter
        s = "rpy123@gmail.com";
        String a[] =  s.split("@");
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(Arrays.toString(a));

        String amount = "$15,20,25,26";
        System.out.println(amount.replace("$", "").replace(",",""));

        //ex2
        s = "abac,1234@xyz";
        String arr1[] = s.split(",");
        System.out.println(Arrays.toString(arr1));
        String arr2[] = arr1[1].split("@");
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        //ex3
        s= "abc 113 nyp";
        String ff[] = s.split(" ");
        System.out.println(Arrays.toString(ff));


    }
}
