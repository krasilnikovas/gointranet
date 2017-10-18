import java.util.Scanner;

public class Polindrom {


    public static void main(String[] args) {

        //Write class that recieve some string or int and checks if this is polyndrom

        System.out.println(isThisIntPolindromSolutionTwo(12321));
    }


    // ---------------------- STRING solutions ----------------------
    public static Boolean isThisStringPolindromSolutionOne(String someString) {
        return someString.equals((new StringBuilder(someString)).reverse().toString());
    }

    public static Boolean isThisStringPolindromSolutionTwo(String someString) {
        char [] arr = someString.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }


    // ---------------------- INT solutions ----------------------
    public static Boolean isThisIntPolindromSolutionOne(int someInt) {
        String someString = Integer.toString(someInt);
        return someString.equals((new StringBuilder(someString)).reverse().toString());
    }

    public static Boolean isThisIntPolindromSolutionTwo(int someInt) {
        char [] arr = Integer.toString(someInt).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }
}

