public class CountInversions {
    public long numberOfInversions(int[] nums) {
        return mergeSort(nums,0, nums.length-1);
    }
    public long mergeSort(int[]nums, int low, int high){
        long count = 0;

        if(low>=high) return 0;

        int mid = low+ (high-low)/2;

        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1,high);
        count+=merge(nums,low,mid,high);

        return count;
    }

    public long merge(int nums[], int low, int mid, int high){
        int left = low;
        int right = mid+1;
        long count = 0;

        int[] temp = new int[high-low+1]; //high-low
        int idx=0;

        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[idx++] = nums[left];
                left++;
            }else{
                //this creates inversion nums[left]>nums[right]

                temp[idx++] = nums[right];
                right++;
                count+=mid-left+1;
            }

            
        }
        while(left<=mid){
                temp[idx++] = nums[left];
                left++;
        }
        while(right<=high){
                temp[idx++] = nums[right];
                right++;
        }

        for(int i=0 ; i<temp.length ; i++){
            nums[low+i] = temp[i];
        }
        return count;
    }
}
