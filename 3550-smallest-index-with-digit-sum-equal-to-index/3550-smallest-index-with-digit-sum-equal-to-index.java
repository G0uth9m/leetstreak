class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;
            if(n>9){
                while(n>0){
                    int dig=n%10;
                    sum+=dig;
                    n/=10;
                }
            }else{
                sum=n;
            }
            
            if(sum==i) return i;
        }
        return -1;
    }
}