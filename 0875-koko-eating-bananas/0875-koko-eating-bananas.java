class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low_sp=1;
        int high_sp=piles[0];
        for (int pile:piles){
            high_sp=Math.max(high_sp,pile);
        }
       
        while(low_sp<high_sp){
             int hrs=0;
            int mid = low_sp + (high_sp-low_sp)/2;
            for(int pile:piles){
                hrs+=(pile+mid-1)/mid;

            }
            if (hrs<=h){
                high_sp=mid;
            }else{
                low_sp=mid+1;
            }

        }

        
        return low_sp;
    }
}