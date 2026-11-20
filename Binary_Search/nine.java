public class nine{
    public int minDays(int[] nums, int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int n = nums.length;
        
        if(m*k> n) return -1;

        for(int i=0 ; i<n ; i++){
            low = Math.min(low,nums[i]);
            high = Math.max(high, nums[i]);
        }
        int ans = -1;

        while(low<=high){
            int mid = low + (high-low)/2;
            int bouquets = 0;
            int consecutive = 0;
            

            //traverse the flowers
            for(int i=0 ; i< n ; i++){
                if(nums[i]<=mid){
                    //flower has bloomed already
                    consecutive++;
                    if(consecutive==k){
                        bouquets++;
                        consecutive=0;
                    }
                }else{
                        //flower hasn't bloomed till now
                        //streak of adjacent flowers has broken
                        consecutive=0;
                }     
            }
            if(bouquets>=m){
                    ans = mid;
                    high = mid-1;
            }else{
                    low = mid+1;
            }
        }
        return ans;
    }
}