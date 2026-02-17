/*
      MAIN CLASS - UseCase1PalindromeApp
      Use Case 1: Application Entry & Welcome Message
* Description:
        * This class represents the entry point of the
* Palindrome Checker Management System.
        * At this stage, the application:
        * - Starts execution from the main() method
* - Displays a welcome message
* - Shows application version
        * No palindrome logic is implemented yet.
        * The goal is to establish a clear startup flow.
        * @author Developer
* @version 1.0
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
    }
}
