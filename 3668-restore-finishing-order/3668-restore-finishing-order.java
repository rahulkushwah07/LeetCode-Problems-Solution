class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        boolean[] isFriend=new boolean[101];
        for(int f:friends){
            isFriend[f]=true;
        }
        int[] result=new int[friends.length];
        int idx=0;
        for(int id:order){
            if(isFriend[id]){
                result[idx++]=id;
            }
        }
        return result;
    
    }
   
}