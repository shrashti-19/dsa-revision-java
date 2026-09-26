import java.util.*;

public class MajorityElement {
    // public static int majorityElement(int[] nums) {
    //     HashMap<Integer,Integer> count = new HashMap<>();
    //     int n = nums.length;

    //     for(int i=0 ; i<n ; i++){
    //         int current = nums[i];

    //         //if current already exists
    //         if(count.containsKey(current)){
    //             //increase the count
    //             count.put(nums[i], count.getOrDefault(nums[i],0)+1);
    //         }else{
    //             // it doesn't exist already in the HashMap
    //             count.put(current, 1);
    //         }
    //     }

    //     for(Map.Entry<Integer,Integer> entry : count.entrySet()){
    //         if(entry.getValue()>n/2){
    //             return entry.getKey();
    //         }
    //     }

    //     return -1;
    // }

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int i=0 ; i<nums.length ; i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(candidate == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
