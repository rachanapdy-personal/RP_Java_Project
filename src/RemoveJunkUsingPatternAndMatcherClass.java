import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveJunkUsingPatternAndMatcherClass {
    static void main() {

        String str = "Hello@#% World!! 123 ^&*() Java";
        Pattern pattern = Pattern.compile("[a-zA-Z0-9 ]"); // keep only letters, digits, spaces

        Matcher matcher = pattern.matcher(str); //Match pattern with input string
        StringBuilder sb = new StringBuilder();

        while(matcher.find()) {
            sb.append(matcher.group());
        }

        System.out.println("Original String : " + str);
        System.out.println("Cleaned String : " + sb);
    }
}
