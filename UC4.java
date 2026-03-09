public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // Convert string to character array
        char[] chars = word.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Two pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}
