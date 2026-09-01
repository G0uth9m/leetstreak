class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> Stack=new Stack<>();
        int a,b;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                Stack.push(Stack.get(Stack.size()-1)+Stack.get(Stack.size()-2));
            }
            else if(operations[i].equals("C")){
                Stack.pop();
            }
            else if(operations[i].equals("D")){
                Stack.push(2*Stack.get(Stack.size()-1));
            }
            else{
                Stack.push(Integer.parseInt(operations[i]));
            }

        }
        int sum=0;
        for(int i:Stack){
            sum+=i;
        }
        return sum;
    }
}