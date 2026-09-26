public class MaxSubarraySum {
      public static int maxSubArray(int[] nums) {
        int cs = nums[0];
        int ms = nums[0];
        int n = nums.length;

        int start = 0;
        int bestStart = 0;
        int bestEnd = 0;
        for(int i=1 ; i<n ; i++){
            if(nums[i]>cs+nums[i]){
                cs = nums[i];
                start = i;
            }else{
                cs+=nums[i];
            }
            //new subarray found
            if(cs>ms){
                ms = cs;
                bestStart = start;
                bestEnd = i;
            }

        }
        for(int i=bestStart ; i<=bestEnd ; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println("");
        return ms;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,5,-4};
        System.out.println(maxSubArray(nums));
    }
}
