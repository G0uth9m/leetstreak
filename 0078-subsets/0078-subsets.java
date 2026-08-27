class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List <List<Integer>> nest=new ArrayList<>();
        List <Integer> sub=new ArrayList<>();
        S(0,sub,nest,nums);
        return nest;
        }
    static void S(int i,List<Integer> sub,List<List<Integer>> nest,int[] nums){
        if(i==nums.length){
            nest.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[i]);
        S(i+1,sub,nest,nums);
        sub.remove(sub.size()-1);
        S(i+1,sub,nest,nums);

    }

}