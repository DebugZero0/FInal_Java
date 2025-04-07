package problem;
import java.util.*;
class longest_palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String::");
		String s=sc.next();
		System.out.println(longestPalindrome(s));
	}
    public static String longestPalindrome(String s) {
        for (int length = s.length(); length > 0; length--) { // Checking from the last
            for (int start = 0; start <= s.length() - length; start++) { 
                if (check(start, start + length, s)) {
                    return s.substring(start, start + length);//NO need to check substring just return largest palindrome
                }
            }
        }
        return "";
    }

    public static boolean check(int i, int j, String s) {
        int left = i;
        int right = j - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
