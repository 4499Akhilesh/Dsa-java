class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        int high = m * n -1;
       while ( ans <= high ){
        int mid = ans + (high - ans) / 2;
        int row = mid/n;
        int col = mid % n;
        if(matrix[row][col]== target){
            return true;
        }
        else if 

        (matrix[row][col]< target) {
        ans = mid + 1; 
       }
      else {
        high = mid -1;
       
       }
}
        return false ;
       }
}
       
