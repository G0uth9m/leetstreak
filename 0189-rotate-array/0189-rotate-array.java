class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
       rot(nums,0,nums.length-1);
       rot(nums,0,k-1);
       rot(nums,k,nums.length-1);
    }
    static void rot(int[] nums ,int i,int j){
            while(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
    }
}