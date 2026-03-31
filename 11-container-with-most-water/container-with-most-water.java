class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max_area = Integer.MIN_VALUE;
        
        while(left<right){
            int width = right-left;
            int s = Math.min(height[left],height[right])*width;
            max_area = Math.max(s,max_area);
            if(height[left]<height[right]){
                left++;
            } 
            else{
                right--;
            }
            
        }
        return max_area;



        
    }
}