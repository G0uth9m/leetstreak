class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q=new LinkedList<>();
        boolean[] seen=new boolean [rooms.size()];
        seen[0]=true;
        q.offer(0);
        while(!q.isEmpty()){
            int current=q.poll();
            for(int i: rooms.get(current)){
                if(!seen[i]){
                    seen[i]=true;
                    q.offer(i);
                }
                
            }
        }
        for(boolean i: seen){
            if(!i){
                return false;
            }
        }
        return true;
        
    }
}