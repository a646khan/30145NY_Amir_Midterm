package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String s = "MOM", t = "SISTER";
        System.out.println(isPalindrome(s) ? s + " is palindrome." : s + " is not palindrome");
        System.out.println(isPalindrome(t) ? t + " is palindrome." : t + " is not palindrome");
    }

    public static boolean isPalindrome(String s) {

        if (s.isEmpty()) {
            return true;
        }

        int left = 0, right = s.length() - 1;

        while(left <= right) {

            char a = s.charAt(left);
            char b = s.charAt(right);

            if (Character.toLowerCase(a) != Character.toLowerCase(b))
                return false;
            left++;
            right--;
        }

        return true;
    }
}
