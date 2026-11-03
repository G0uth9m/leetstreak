class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int steps=0;
        for(int i:nums){
            steps+=max-i;
        }
        return steps;
    }
}