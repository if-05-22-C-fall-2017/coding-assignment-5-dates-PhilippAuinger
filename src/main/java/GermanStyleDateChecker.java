import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    
    public static Matcher getMatcher(String dateString) {
        Pattern PATTERN = Pattern.compile("(^([1-2]\\d)|^(0?\\d)|^(3(0|1)))(\\.|-| )((1[0-2])|(0?\\d))(\\.|-| )((1|2)(0|9))?\\d\\d$");
        return PATTERN.matcher(dateString);
    }
}
