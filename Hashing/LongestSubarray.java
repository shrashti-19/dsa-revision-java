
import java.util.HashMap;

public class LongestSubarray{
    public static int longestSubarraySumK(int nums[], int k){
        int n = nums.length;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // prefix sum 0 before the array starts

        int currentPrefix = 0;
        for(int i=0 ; i<n ; i++){
            int length =0;
            currentPrefix+=nums[i];

            

            int neededPrefix = currentPrefix - k;
            if(map.containsKey(neededPrefix)){
                length  = i-map.get(neededPrefix);
                maxLength = Math.max(length, maxLength);
            }
            if(!map.containsKey(currentPrefix)){
                map.put(currentPrefix,i);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int nums[] = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(longestSubarraySumK(nums,k));
    }
}