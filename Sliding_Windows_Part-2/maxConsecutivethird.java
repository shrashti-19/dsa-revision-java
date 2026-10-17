public class maxConsecutivethird {
    public int longestOnes(int[] nums, int k){
        int n = nums.length;
        int left = 0;
        int zeroesCount = 0;
        int maxLength = 0;

        for(int right=0 ; right<n ; right++){
            if(nums[right]==0){
                zeroesCount++;
            }
            while(zeroesCount>k){
                if(nums[left]==0){
                    zeroesCount--;
                }
                left++;
            }
            int length = right-left+1;
            maxLength = Math.max(length, maxLength);
        }
        return maxLength;
    }
}
