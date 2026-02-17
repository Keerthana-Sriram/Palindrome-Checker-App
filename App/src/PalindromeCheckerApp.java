/*
  MAIN CLASS - UseCase2PalindromeCheckerApp

* Use Case 2: Hardcoded Palindrome Validation

* Description:
        * This class demonstrates basic palindrome validation
* using a hardcoded string value.
        * At this stage, the application:
        * - Stores a predefined string
* - Compares characters from both ends
* - Determines whether the string is a palindrome
* - Displays the result on the console
        * This use case introduces fundamental comparison logic
* before using advanced data structures.

* @author Developer
* @version 2.0
        */
import java.util.*;
public class PalindromeCheckerApp {

    public static void main(String [] args){
        System.out.println("Author: Keerthana");
        System.out.println("Version: 3.0");
        char[] charArray = "Hello";
        int start = 0;
        int end = str.length() - 1;
        char[] charArray2 = charArray;
        while (start < end) {
            char temp = charArray2[start];
            charArray2[start] = charArray2[end];
            charArray2[end] = temp;
            start++;
            end--;
        }
        if (charArray2==charArray)
            System.out.println(charArray+" is a palindrome.");
        else
            System.out.println(charArray+" is not a palindrome.");
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String [] args){
        System.out.println("Author: Keerthana");
        System.out.println("Version: 2.0");

        String s1 = "madam";
        String s2 = "hello";

        System.out.println(s1+" is a")
    }
}
