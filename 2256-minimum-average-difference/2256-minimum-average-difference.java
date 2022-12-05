class Solution {
    public int minimumAverageDifference(int[] nums) {
        
        int n = nums.length;
        long avg_Difference = Integer.MAX_VALUE;
        int result = 0;
        
        long sumFromBeg=0;
        long sumFromEnd = 0;
        
        for(int i : nums)
            sumFromEnd += i;
        
        
        for(int i =0 ; i<n ; i++){
            
            sumFromBeg += nums[i];
            sumFromEnd -= nums[i];
            
            long  preEleSum = sumFromBeg / (i + 1);
            long  postEleAvg = i == n-1 ? 0 : sumFromEnd / (n - i - 1);
            
            
            long absDifference = Math.abs(preEleSum - postEleAvg);
            
            if(absDifference < avg_Difference){
                avg_Difference = absDifference;
                result = i;
            }
        
        }
        
        return result;
       
    }
}