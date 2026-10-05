public class ReversePairs {
   public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    public int mergeSort(int nums[], int low, int high){
        if(low>=high){
            return 0;
        }

        int count = 0;
        int mid = low + (high-low)/2;

        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1, high);
        count+=merge(nums,low,mid,high);

        return count;
    }

    public int merge(int nums[], int low, int mid, int high){
        int count = 0;

        int left = low, right = mid+1;

        //left sorted part
        for(int i=low ; i<=mid ; i++){
            while(right<=high && nums[i]>2L*nums[right]){
                right++;
            }
            count+=right-(mid+1);
        }

        // pointers again initialization
        left = low;
        right = mid+1;

        int idx = 0;
        int[] temp = new int[high-low+1];

        while(left<=mid && right<=high){
            if(nums[left]>=nums[right]){
                temp[idx++] = nums[right];
                right++;
            }else{
                temp[idx++] = nums[left];
                left++;
            }
        }
        while(left<=mid){
            temp[idx++]  = nums[left];
            left++;
        }
        while(right<=high){
            temp[idx++] = nums[right];
            right++;
        }

        //copying back to normal array
        for(int i=0 ; i<temp.length ; i++){
            nums[i+low]= temp[i];
        }
        return count;
    }
}
