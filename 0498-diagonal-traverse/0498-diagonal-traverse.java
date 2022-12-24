import java.util.*;
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

             // Check for empty matrices
        if (mat == null || mat.length == 0 ) {
            return new int[0];
        }
            int m = mat.length;
            int n = mat[0].length;
            int r=0,c=0;
            int[] res = new int[m*n];
            for(int k =0 ; k < res.length ; k++){
                
                res[k] = mat[r][c];
                
                if( ((r+c)&1) == 0 ){
                    
                    if(c== n -1)
                        r++;
                    else if(r==0)
                        c++;
                    else{
                        r--;
                        c++;
                    }
                 
                }
                else {
                    
                    if(r==m-1)
                        c++;
                    else if(c == 0)
                        r++;
                    else{
                           
                    r++;
                    c--;
                    }
                    
                 
                }  
            }

        return res;
    }
}