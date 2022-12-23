class Solution {
    /*flipping [1,1,0] horizontally results in [0,1,1]
    * Invert an image means that each 0 is replaced by 1,
    * inverting [0,1,1] results in [1,0,0].
    */
    public int[][] flipAndInvertImage(int[][] image) {
        
        // Calculation length it is nxn matrix single variable is enough
        int n = image.length;
        
        // First step is to reverse column in each row by swapping 
        
        for(int i =0 ; i< n; i++){
            
            for(int j = 0 ; j<n/2; j++){
                
                int temp = image[i][j];
                image[i][j] = image[i][n-1-j];
                image[i][n-1-j] = temp;
                
            }
            
        }
        
        // Replace the 0's with 1 and viceversa
        
        for(int i = 0; i< n; i++){
            for(int j=0; j<n; j++){
                if(image[i][j]==0)
                    image[i][j] = 1;
                else
                    image[i][j] = 0;
            }
                
        }
        
        return image;
        
    }
}