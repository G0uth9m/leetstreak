class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int coin:coins){
                if(coin<=i && dp[i-coin]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],1+dp[i-coin]);
                }
            }
        }
        if(dp[amount]==Integer.MAX_VALUE){
            return -1;
        }else{
            return dp[amount];
        }
    }
}