class Solution {
    public int rob(int[] nums) {
        int[] maxmall=new int[nums.length];
        if(nums.length==0){
            return 0;
        }
        
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        maxmall[0]=nums[0];
        maxmall[1]=nums[1];
        maxmall[2]=nums[0]+nums[2];
        if(nums.length==3){
            return Math.max(maxmall[1],maxmall[2]);
        }
        for(int i=3;i<nums.length;i++){
            maxmall[i]=nums[i]+Math.max(maxmall[i-2],maxmall[i-3]);
        }
        return Math.max(maxmall[nums.length-1],maxmall[nums.length-2]);

    }
}