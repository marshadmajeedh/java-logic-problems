import java.util.ArrayList;
import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static int lengthOfLongestSubstring(String s,int k) {

        int maxFrequency = 0;

        int length = 0;
        int maxLength = 0;
        int left = 0;

        //"CAA"

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++){

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            length++;

            if (map.get(s.charAt(i)) > maxFrequency){
                maxFrequency = map.get(s.charAt(i));
            }

            while ((length-maxFrequency) > k){

                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                length--;

                if (map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }
                left++;
            }

            maxLength = Math.max(length,maxLength);
        }

        return maxLength;
    }
}
