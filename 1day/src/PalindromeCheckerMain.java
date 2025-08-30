import java.util.Scanner;

public class PalindromeCheckerMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //coding challenge day 1
        System.out.println("Check if a string is a palindrome or not : ");
        System.out.print ("Enter a String : ");
        String str = sc.nextLine();

        System.out.println ("\nGiven String "+str+" is a : "+((PalindromeChecker.isPalindrome(str,0,str.length()-1)) ? "palindrome" : "Not a palindrome"));
    }
}
