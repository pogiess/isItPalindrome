import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("type a String to check if its a palindrome string or no : ");
        String mainString = scn.nextLine();

        System.out.println(isItPalindrom(mainString));

    }

    public static boolean isItPalindrom(String checkString) {
        char[] arr1 = new char[checkString.length()];
        char[] arr2 = new char[checkString.length()];
        int index = 0;

        for (int i = checkString.length() - 1; i >= 0 ; i--) {
            arr1[index] = (char) checkString.toLowerCase().charAt(i);
            index++;
        }

        for (int i = 0; i < checkString.length(); i++) {
            arr2[i] = checkString.toLowerCase().charAt(i);
        }

        return Arrays.toString(arr1).equals(Arrays.toString(arr2));
    }
}