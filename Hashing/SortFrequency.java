import java.util.*;

public class SortFrequency{
    public String frequencySort(String s) {
        //lowercase + uppercase + duplicates allowed
        StringBuilder result = new StringBuilder();

        HashMap<Character,Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0 ; i<n ; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.getOrDefault(c,0)+1);
            }else{
                map.put(c,1);
            }
        }
        while(!map.isEmpty()){
              int maxFrequency = 0;
              char maxCharacter ='\0';

              for(Map.Entry<Character, Integer> entry : map.entrySet()){
                char c = entry.getKey();
                int freq = entry.getValue();

                if(freq> maxFrequency){
                  maxFrequency = freq;
                  maxCharacter = c;
                }
              }
                for(int i=0 ; i<maxFrequency ; i++){
                    result.append(maxCharacter);
                }

              map.remove(maxCharacter);
            }
            return result.toString();
        }
        

}