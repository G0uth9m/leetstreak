class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen=new HashSet<>();
        while(!seen.contains(n)){
            seen.add(n);
            n=getnum(n);
            if(n==1){
                return true;
            }
        }
        return false;
        
    }
    public int getnum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
}