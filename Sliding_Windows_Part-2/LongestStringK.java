import java.util.*;

public class LongestStringK {
    public int kDistinctChar(String s, int k) {
        // int maxlen = 0;
        // int n = s.length();

        // for(int i =0 ; i<n ; i++){
        //     HashSet<Character> set = new HashSet<>();
        //     for(int j=i ; j<n ; j++){
        //         set.add(s.charAt(j));

        //         if(set.size()>k){
        //             break;
        //         }
        //         maxlen = Math.max(j-i+1, maxlen);
        //     }
        // }
        // return maxlen;
        int left =0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int maxlen = 0;
        for(int right=0 ; right<n ; right++){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);

            while(map.size()>k){
                char ch = s.charAt(left);
                int currentFreq = map.get(ch);
                currentFreq--;
                map.put(ch, currentFreq);
                if(currentFreq==0){
                    map.remove(ch);
                }
                left++;
            }
            maxlen = Math.max(maxlen, right-left+1);
        }
        return maxlen;

    }
}
