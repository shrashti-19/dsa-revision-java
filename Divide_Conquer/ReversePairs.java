public class ReversePairs {
    public int reversePairs(int[] nums) {
        int reverse_count = 0;
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i]>2L*nums[j]){
                    reverse_count++;
                }
            }
        }
        return reverse_count;
    }
}
