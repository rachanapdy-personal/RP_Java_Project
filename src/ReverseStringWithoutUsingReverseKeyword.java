public class ReverseStringWithoutUsingReverseKeyword {
    static void main() {
        String str = "Rachana Pandey";
        String reversed = "";

        // Simple, but not efficient for very large strings
        // (because String is immutable, it creates new objects every time we use +

        for(int i = str.length()-1 ; i>=0 ; i--)
        {
            reversed = reversed + str.charAt(i); //append each other from the end
        }
        System.out.println(reversed);
    }
}
