import java.util.Arrays;

public class Palindrome {

    public boolean isPalindrome(String text) {
        boolean palindromeArray = false;



        String text2 = text.replaceAll("[?>./,<]", "");
        char[] palindrome = text2.toCharArray();
        if (palindrome.length == 1) palindromeArray = true;


        for (int i = 0; i < palindrome.length; i++) {
            palindrome[i] = Character.toUpperCase(palindrome[i]);
        }


        String text3 = text.replaceAll("[?>./,<]", "");
        char[] palindrome2 = text3.toCharArray();
        for (int i = 0; i < palindrome2.length; i++) {
            palindrome2[i] = Character.toUpperCase(palindrome2[i]);
        }
        for (int i = 0, j = palindrome2.length - 1; i < palindrome2.length / 2; i++, j--) {
            char temp = palindrome2[i];
            palindrome2[i] = palindrome2[j];
            palindrome2[j] = temp;
        }
       if (Arrays.equals(palindrome, palindrome2)) palindromeArray = true;
        return palindromeArray;
    }
}
