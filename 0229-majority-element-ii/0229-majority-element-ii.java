class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map <Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List <Integer> arr=new ArrayList<>();
        int lim=nums.length/3;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>lim){
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}