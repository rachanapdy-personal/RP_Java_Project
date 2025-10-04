public class ReversedStringUsingStringBuilder {
    static void main() {
        String str = "Rachana Pandey";
        StringBuilder sb = new StringBuilder();

        //Better performance since StringBuilder is mutable.
        //(We are not using sb.reverse(), we manually append characters in reverse order.)

        for (int i = str.length()-1 ; i>=0 ; i--)
        {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
}
