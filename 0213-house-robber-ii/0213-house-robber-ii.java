class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length<2){
            return nums[0];
        }
        int[] firstskip=new int[nums.length-1];
        int[] lastskip=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            firstskip[i]=nums[i+1];
            lastskip[i]=nums[i];
        }
        int fs=cost(firstskip);
        int ls=cost(lastskip);
        return Math.max(fs,ls);
    }
    private int cost(int[] arr){
        if(arr.length<2){
            return arr[0];
        }
        int[] maxcst=new int[arr.length];
        maxcst[0]=arr[0];
        maxcst[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            maxcst[i]=Math.max(maxcst[i-1],arr[i]+maxcst[i-2]);
        }
        return maxcst[arr.length-1];
    }
}