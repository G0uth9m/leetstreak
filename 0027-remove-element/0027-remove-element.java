class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        int temp=0;
        while(i<=j){
            if(nums[i]==val){
                while(j>=i && nums[j]==val){
                    j--;
                }
                if(i<=j){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j--;
                }
            }
            i++;
        }
        return j+1;
    }
}