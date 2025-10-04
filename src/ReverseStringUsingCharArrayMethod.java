public class ReverseStringUsingCharArrayMethod {
    static void main() {
        String str = "Rachana Pandey";
        char[] a = str.toCharArray();
        String rev = "";

        for(int i = str.length()-1 ; i>=0 ; i--)
        {
            rev += a[i];
        }
        System.out.println(rev);
    }
}
