// class Solution {
//     public void moveZeroes(int[] nums) {
//         int left = 0;
//         for(int right=0 ; right<nums.length ; right++){
//             if(nums[right]==0){
//               //do nothing
//             }else{
//                 //nums[right]!=0
//                 int temp = nums[right];
//                 nums[right] = nums[left];
//                 nums[left] = temp;

//                 left++;

//             }
//         }
//     }
// }

// xor approach

class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        int n= nums.length;

        for(int i=0 ; i<n ; i++){
            xor^=nums[i];
        }

        int xor1= 0;
        for(int i=0 ; i<=n ; i++){
            xor1^=i;
        }

        int result = xor^xor1;

        return result;
    }
}