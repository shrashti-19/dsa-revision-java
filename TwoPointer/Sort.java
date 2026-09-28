public class Sort{
    public static void sortArray(int nums[]){
        int left = 0;
        int right = nums.length-1;
        int mid = 0;

        while(mid<=right){
            if(nums[mid]==0){
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                left++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,0,2,1,0};
        sortArray(nums);
        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i]  + ", ");
        }
        System.out.println();
    }
}