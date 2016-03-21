import java.util.regex.*;


public class GhettoNumeralSystem {

    String text =
            "Hello, my number in Sofia is +359 894 11 22 33, " +
                    "but in Munich my number is +49 89 975-99222.";
    Pattern phonePattern = Pattern.compile(
            "\\+\\d{1,3}([ -]*([0-9]+))+");
    Matcher matcher = phonePattern.matcher(text);
    while (matcher.find()) {
        System.out.println(matcher.group());
    }



}
