import java.util.HashMap;

public class Binary{
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int cp = 0;
        int count = 0;
        for(int i=0 ; i<n ; i++){
            cp+=nums[i];
            int need = cp-goal;
            if(map.containsKey(need)){
                count+=map.get(need);
            }
            map.put(cp, map.getOrDefault(cp, 0)+1);
        }
        return count;
    }
}