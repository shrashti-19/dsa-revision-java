
public class six {
public int singleNonDuplicate(int[] nums) {
      int low = 0;
      int n = nums.length;
      int high = n-1;

      while(low<high){
        int mid = low +(high-low)/2;

        if(nums[mid]==nums[mid^1]){
            //pairing match
            low = mid+1;
        }else{
            high = mid;
        }
      }
      return nums[low];
    }
}
