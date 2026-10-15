import java.util.*;

public class LongestSubString{
    public int longestNonRepeatingSubstring(String s) {
        //your code goes here
        HashSet<Character> set = new HashSet<>();
        int left =0;
        int maxlen=0;
        int n = s.length();

        for(int right=0 ; right<n ; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            int len  = (right-left+1);
            maxlen = Math.max(len,maxlen);
        }
        return maxlen;
    }
}