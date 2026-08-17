class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int score=0;
        for(int num:nums){
            if(score==0){
                candidate=num;
            }
            if(num==candidate){
                score++;
            }
            else{
                score--;
            }
        }
            return candidate;
            
            
        }


    }
