class Solution {
    public int findNumbers(int[] nums) {
        
        int ans = 0;
        
        for(int num : nums){
            int count = 0;
            while(num!=0){
                num = num/10;
                count++;
            }
            if((count& 1) == 0)
                ans++;
        }
        
        return ans;
        
    }
}