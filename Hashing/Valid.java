public class Valid {
        public boolean anagramStrings(String s, String t) {
        //your code goes here
        int[] cnt = new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0 ; i<s.length() ; i++){
            cnt[s.charAt(i)-'a']++;
            cnt[t.charAt(i)-'a']--;
        }
        for(int num: cnt){
            if(num!=0){
                return false;
            }
        }
        return true;
    }
}
