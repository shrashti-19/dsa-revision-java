public class eight{
    public int smallestDivisor(int[] nums, int limit) {
       int n = nums.length;
       int max = Integer.MIN_VALUE;

       for(int i=0 ; i<n ; i++){
        max = Math.max(max,nums[i]);
       }

      

       for(int i=1 ; i<=max ; i++){
         int sum = 0;
         for(int j=0 ; j<n ; j++){
            sum+=(nums[j]+i-1)/i;

            
         }
         if(sum<=limit){
                return i;
            }
       }
       return -1;
    }
}