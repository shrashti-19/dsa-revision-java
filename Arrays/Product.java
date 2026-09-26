public class Product{
     public static int maxProduct(int[] nums) {
        int mp = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++){
            int cp = 1;
            for(int j=i ; j<nums.length; j++){
                cp*=nums[j];
                mp = Math.max(cp,mp);
            }
        }
        return mp;
     }

     public static void main(String[] args) {
        int nums[] = {2,-3,2,4};
        System.out.println("Maximum Product subarray: " + maxProduct(nums));
     }
}