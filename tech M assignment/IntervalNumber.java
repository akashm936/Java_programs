import java.util.Scanner;

public class IntervalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with numbers:");
        String input = scanner.nextLine();
        System.out.println("Interval:");
        int interval = scanner.nextInt();
        
        String replacedString = replaceWithInterval(input, interval);
        System.out.println("Result: " + replacedString);
    }

    private static String replaceWithInterval(String input, int interval) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                int num = Character.getNumericValue(currentChar);
                int intervalNum = (num / interval) * interval; // rounding down
                result.append(intervalNum);
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}