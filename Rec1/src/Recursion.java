public class Recursion {

    public static String reverseString(String str,String strCopy,int i) {

        if (strCopy.length() == str.length()) {
            return strCopy;
        }

        strCopy = strCopy + str.charAt(str.length() - i - 1);
        return reverseString(str,strCopy,i+1);
    }
}
