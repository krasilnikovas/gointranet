import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {

        //Write method that receive some string or int and checks if this is palindrome

        System.out.println(isThisStringPalindromSolutionTwo("12344321"));
    }


    // ---------------------- STRING solutions ----------------------
    public static Boolean isThisStringPalindromSolutionOne(String someString) {
        return someString.equals((new StringBuilder(someString)).reverse().toString());
    }

    public static Boolean isThisStringPalindromSolutionTwo(String someString) {
        char [] arr = someString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }


    // ---------------------- INT solutions ----------------------
    public static Boolean isThisIntPalindromSolutionOne(int someInt) {
        String someString = Integer.toString(someInt);
        return someString.equals((new StringBuilder(someString)).reverse().toString());
    }

    public static Boolean isThisIntPalindromSolutionTwo(int someInt) {
        char [] arr = Integer.toString(someInt).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }
}

