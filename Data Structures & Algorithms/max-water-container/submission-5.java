class Solution {
    public int maxArea(int[] heights) {
       int left = 0;
        int max = 0;
        int right = heights.length-1;
        while (right > left){
            int min = Math.min(heights[left], heights[right] );
            int D = right - left;
            int area = D * min;
            max = Math.max(max, area);
            if (heights[left] < heights[right]){
                left++;
            }else {
                right--;
            }
        }
        return max;
    }
}
