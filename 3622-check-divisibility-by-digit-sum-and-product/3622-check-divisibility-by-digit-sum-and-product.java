class Solution {
    public boolean checkDivisibility(int n) {
        String s=Integer.toString(n);
        int pd=1,sum=0;
        for (int i=0;i<s.length();i++){
            sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
            pd*=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return n % (sum+pd) == 0;

            
    }
}