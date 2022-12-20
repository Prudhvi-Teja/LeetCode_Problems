class Solution {
    public int minCostToMoveChips(int[] position) {
        
        int odd_count = 0, even_count = 0;
        
        for(int num : position){
            
            if((num & 1) == 0)
                even_count++;
            else
                odd_count++;
            
        }
        
        return Math.min(even_count,odd_count);
        
        
    }
}