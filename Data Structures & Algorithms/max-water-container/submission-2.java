class Solution {
    public int maxArea(int[] heights) {
        // declare 2 pointers
        // while left side is less than right
        // move left by 1
        // check area each time to find the max
        // min both the bars to take the smaller bar

        int left = 0;
        int right = heights.length - 1;
        int area = 0; // r - l to get the width

        while (left < right){
            int leftBar = heights[left];
            int rightBar = heights[right];

            //calc area
            area = Math.max(area, ( right - left )* Math.min(leftBar, rightBar));

            if (leftBar > rightBar){
                right -= 1;
            } else {
                left += 1;
            }
        }

        return area;


    }
}
