public class five {
     public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int total_elements = n*m;

        int low = 0;
        int high = total_elements-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int row = mid/m;
            int col = mid%m;

            if(mat[row][col]==target){
                return true;
            }
            else if(mat[row][col]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
}
