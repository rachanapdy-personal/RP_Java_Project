public class RemoveJunkOrSpecialCharactersInString {
    static void main() {
        String str = "Hello@#% World!! 123 ^&*() Java";
        // Regex: [^a-zA-Z0-9 ] → keep only letters, digits, and spaces
        //String cleanedStr = str.replaceAll("[^a-zA-Z0-9 ]", "");
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9 ]" , "");

        System.out.println("Original String: " + str);
        System.out.println("Cleaned String: " + cleanedStr);
        /*Explanation of Regex

^ → NOT
a-z → lowercase letters
A-Z → uppercase letters
0-9 → digits
(space) → keep spaces
So [^a-zA-Z0-9 ] means: remove everything except letters, digits, and spaces.
*/
  }
}
