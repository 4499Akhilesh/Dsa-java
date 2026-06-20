class Solution {
    public int[] sortedSquares(int[] nums) { 
        //  This is the Better approach 
        // int m = nums.length;
        // for(int i = 0; i<m; i++){
        //    nums[i] = nums[i] * nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;


        
        //   This is the optimal Approach 
        int m =  nums.length;
         int[] ans = new int [m];
        int left = 0;
        int right = m - 1;
        int pos =  m - 1;
        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if(leftSquare > rightSquare) {
                ans[pos] = leftSquare;
                left++;
            } else {
                ans[pos] = rightSquare;
                right--;
            }
            pos--;
            
        }
        return ans;
    }
}
