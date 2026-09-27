class Solution {
    public int candy(int[] ratings) {     
        int[] ca=new int[ratings.length];
        Arrays.fill(ca,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                ca[i]=ca[i-1]+1;
            }
        } 
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                ca[i]=Math.max(ca[i],ca[i+1]+1);
            }
        }
        int sum=0;
        for(int i:ca){
            sum+=i;
        }  
        return sum;
    }
}