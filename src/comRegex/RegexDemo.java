package comRegex;

import java.util.regex.*;

public class RegexDemo {
    public static void main(String[] args) {

        String input = "My phone number is 9876543210 and my pin is 1234.";

        // ✅ 1. Compile regex pattern
        Pattern pattern = Pattern.compile("\\d{10}");  // 10-digit number

        // ✅ 2. Create matcher from input string
        Matcher matcher = pattern.matcher(input);

        // ✅ 3. Use find() to search
        if (matcher.find()) {
            System.out.println("Found phone number: " + matcher.group());
        }

        // ✅ 4. matches() - check full string
        boolean exactMatch = "1234".matches("\\d{4}");
        System.out.println("Is 4-digit PIN valid? " + exactMatch);  // true

        // ✅ 5. replaceAll() - use with String
        String censored = input.replaceAll("\\d{4}", "****");
        System.out.println("Censored PIN: " + censored);

        // ✅ 6. split() - using String method
        String sentence = "apple,banana,mango";
        String[] fruits = sentence.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

