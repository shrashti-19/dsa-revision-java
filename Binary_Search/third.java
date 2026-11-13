public class third{
    public int[] searchRange(int[] nums, int target) {
        int firstans = firstOccurrence(nums,target);
        int secondans = secondOccurrence(nums,target);

        return new int[]{firstans, secondans};
    }
    public int firstOccurrence(int nums[], int target){
        int ans = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                ans = mid;
                right = mid-1;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
    public int secondOccurrence(int[]nums, int target){
        int ans = -1;
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                ans = mid;
                left = mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}