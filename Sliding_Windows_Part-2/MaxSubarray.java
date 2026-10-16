public class MaxSubarray {
        public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int n = nums.length;
        
        int sum = 0;

        //build the window
        for(int right=0 ;  right<k ;  right++){
            sum+=nums[right];
        }   
        int maxSum = sum;
        //slide the window
        for(int right=k ; right<n ; right++){
            sum-=nums[left];
            left++;
            sum+=nums[right];

            maxSum = Math.max(sum, maxSum);
        }
        return (double)maxSum/k;
    }
}
