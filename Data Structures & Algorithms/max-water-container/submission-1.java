class Solution {
    public int maxArea(int[] heights) {
        // declare 2 pointers
        // while left side is less than right
        // move left by 1
        // check area each time to find the max
        // min both the bars to take the smaller bar

        int l = 0;
        int r = heights.length - 1;
        int area = 0;

        while (l<r){

            int temp_area = (r - l) * Math.min(heights[l],heights[r]);
            if (temp_area > area){
                area = temp_area;
            }
            if (heights[l] > heights[r]){
                
                // if left side is larger, move right side
                r--;

            } else {
                // if right side is larger, move left side
                l++;
            }

        }
        return area;



    }
}
