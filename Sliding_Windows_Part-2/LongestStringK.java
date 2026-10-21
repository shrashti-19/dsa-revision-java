import java.util.HashSet;

public class LongestStringK {
    public int kDistinctChar(String s, int k) {
        int maxlen = 0;
        int n = s.length();

        for(int i =0 ; i<n ; i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i ; j<n ; j++){
                set.add(s.charAt(j));

                if(set.size()>k){
                    break;
                }
                maxlen = Math.max(j-i+1, maxlen);
            }
        }
        return maxlen;
    }
}
