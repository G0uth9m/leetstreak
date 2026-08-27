class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> nest=new ArrayList<>();
        List <Integer> sub=new ArrayList<>();
        boolean[] seen=new boolean[nums.length];
        subset(nums,nest,sub,seen);
        return nest;
    }
    static void subset(int[] nums,List<List<Integer>> nest,List <Integer> sub,boolean[] seen){
        if(sub.size()==nums.length){
            nest.add(new ArrayList<>(sub));
        }
        for(int i=0;i<nums.length;i++){
            if(seen[i]){
                continue;
            }
            sub.add(nums[i]);
            seen[i]=true;
             subset(nums,nest,sub,seen);

            sub.remove(sub.size()-1);
            seen[i]=false;
        }
    
}
}
