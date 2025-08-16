public class Recursion {

    public static int countCharacters(String str, char chr,int i,int count) {

        if (i == str.length()) {
            return count;
        }

        if (str.charAt(i) == chr) {
            return countCharacters(str,chr,i+1,count + 1);
        }
        return countCharacters(str,chr,i+1,count);
    }
}
