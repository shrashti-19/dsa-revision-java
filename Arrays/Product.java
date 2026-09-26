public class Product {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int mp = nums[0];
        int cMin = nums[0];
        int cMax = nums[0];

        for(int i=1 ; i<nums.length ; i++){
            int cnew_max = Math.max(nums[i], Math.max(nums[i]*cMax, nums[i]*cMin));
            int cnew_min = Math.min(nums[i], Math.min(nums[i]*cMin, nums[i]*cMax));
            mp = Math.max(cnew_max,mp);
            
            cMax = cnew_max;
            cMin = cnew_min;
        }
        return mp;
    }

    public static void main(String[] args) {
        int[] nums = {2, -3, 2, 4};
        System.out.println("Maximum Product subarray: " + maxProduct(nums));
    }
}