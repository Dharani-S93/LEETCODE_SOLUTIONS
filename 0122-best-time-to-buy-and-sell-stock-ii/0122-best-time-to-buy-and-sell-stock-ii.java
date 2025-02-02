class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int ans=0;
        for(int i=1;i<n;i++){
            int market=prices[i]-prices[i-1];
            if(market>0){
                ans+=market;
            }
        } 
        return ans;       
    }
}