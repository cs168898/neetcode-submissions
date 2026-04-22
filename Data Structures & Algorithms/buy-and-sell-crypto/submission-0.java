class Solution {
    public int maxProfit(int[] prices) {
        int minbuy = prices[0];
        int maxp = 0;

        for (int price : prices){
            int profits = price - minbuy;
            maxp = Math.max(profits, maxp);
            minbuy = Math.min(minbuy,price);
        }

        return maxp;
        
       
    }
}
