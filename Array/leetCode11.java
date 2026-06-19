class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int right = height.length-1;
        int left = 0;

        while(left<right){
            int width = right - left;
            int currArea = Math.min(height[left] ,height[right]) * width;
            maxArea = Math.max(maxArea, currArea);
            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
        
        
        
    }
}
