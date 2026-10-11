public class LongestSubarray{
    public static int longestSubarraySumK(int nums[], int k){
        int n = nums.length;
        int maxLength =0;
        for(int i=0 ; i<n ; i++){
            int sum = 0;
            for(int j=i ; j<n ; j++){
                sum+=nums[j];
                if(sum == k){
                    int currentLength = j-i+1;
                    maxLength = Math.max(currentLength, maxLength);
                }
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