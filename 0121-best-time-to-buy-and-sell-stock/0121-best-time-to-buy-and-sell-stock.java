class Solution {
    public int maxProfit(int[] prices) {
        int mps=prices[0];
        int mxp=0;
        for(int i=1;i<prices.length;i++){
            mxp=Math.max(mxp,prices[i]-mps);
            mps=Math.min(mps,prices[i]);
        }
        return mxp;
    }
}