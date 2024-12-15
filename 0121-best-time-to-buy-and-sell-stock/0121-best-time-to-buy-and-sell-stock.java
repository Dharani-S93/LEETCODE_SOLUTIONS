class Solution {
    public int maxProfit(int[] prices) {
        int j=0;
        int i=0;
        int diff=0;
        while(j<prices.length)
        {
            if(prices[i]>=prices[j])
            {
                i=j;
            }
            else
            {
                diff=Math.max(diff,prices[j]-prices[i]);
            }
            j++;
        }
        return diff;
    }
}