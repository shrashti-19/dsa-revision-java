public class eight{
public int smallestDivisor(int[] nums, int limit) {
       int n = nums.length;
       int max = Integer.MIN_VALUE;
       for(int i=0 ; i<n ; i++){
        max = Math.max(max,nums[i]);
       }
       int low=1;
       int high = max;
       int ans = -1;
       while(low<=high){
        int mid = low+(high-low)/2;
        int sum=0;
        for(int j=0 ; j<n  ; j++){
            sum+=(nums[j]+mid-1)/mid;
        }
        if(sum<=limit){
                ans = mid;
                high = mid-1;
        }else{ // divisor is too small search in right side
                low = mid+1;
        }

       }
       return ans;
    }
}