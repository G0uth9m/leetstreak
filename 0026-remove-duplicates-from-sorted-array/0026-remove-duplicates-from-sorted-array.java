class Solution {
    public int removeDuplicates(int[] nums) {
        int front=0;
        int back=0;
        int temp=0;
        while(front<nums.length){
           while(front<nums.length && nums[front]==nums[back]){
            front++;
           }
           if(front==nums.length){
            break;
           }
           back++;
           nums[back]=nums[front];
        }
        return back+1;
    }
}