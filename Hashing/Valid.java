import java.util.HashMap;

public class Valid {
   public boolean anagramStrings(String s, String t) {
        //your code goes here
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(int count: map.values()){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
