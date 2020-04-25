public class PalindromeChecker {

        public static boolean isPalindrome(String word) {
            int i = 0;
            int j = word.length() - 1;

            while (i <= j) {
                char ch1 = Character.toLowerCase(word.charAt(i));
                char ch2 = Character.toLowerCase(word.charAt(j));

                if (ch1 != ch2) {
                    return false;}
                i++;
                j--;

            }return true;
        }}

