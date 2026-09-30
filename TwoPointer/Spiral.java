import java.util.*;

public class Spiral{
    public static List<Integer> spiralOrder(int nums[][])
    {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = nums.length-1;
        int left = 0;
        int right = nums[0].length-1;

        while(left<=right && top<=bottom){
            for(int j=left ; j<=right ; j++){
                result.add(nums[top][j]);
            }
            top++;

            for(int j=top ; j<=bottom ; j++){
                result.add(nums[j][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right  ; i>=left ; i--){
                    result.add(nums[bottom][i]);
                }
            }
            bottom--;

            if(left<=right){
                for(int i=bottom ; i>=top ; i--){
                    result.add(nums[i][left]);
                }
            }
            left++;

        }
        return result;
    }
}