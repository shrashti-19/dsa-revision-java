import java.util.*;
public class CountSubarray {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        int currentPrefix = 0;
        int count =0;
        map.put(0,1);

        for(int i=0 ; i<n ; i++){
            currentPrefix+=nums[i];
            int need = currentPrefix-k;
            if(map.containsKey(need)){
                count+=map.get(need);
            }

            map.put(currentPrefix, map.getOrDefault(currentPrefix,0)+1);
        }
        return count;
    }
}
