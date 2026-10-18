import java.util.HashMap;

public class Fruits {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int right=0 ; right<n ; right++){
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);

            //invalid window
            while(map.size()>2){
                int currentFreq = map.get(fruits[left]);
                currentFreq--;
                map.put(fruits[left], currentFreq);
                if(currentFreq==0){
                    map.remove(fruits[left]);
                }
                left++;
            }
            int length = right-left+1;
            maxLen = Math.max(length, maxLen);
        }
        return maxLen;
    }
}
