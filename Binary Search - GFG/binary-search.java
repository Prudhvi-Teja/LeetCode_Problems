//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        // code here
        
       int size = 2 * n - 1;
       
       int[][] mat = new int[size][size];
       
       int top = 0;
       int bottom = 2 * n - 2;
       int left = 0;
       int right = 2 * n -2;
       
       while(n > 0){
           
            for(int i = left ; i<=right ; i++)
                mat[top][i] = n;
            top++;
            for(int i = top ; i<=bottom ; i++)
                mat[i][right] = n;
            right--;
            for(int i = right; i>=left ; i--)
                mat[bottom][i] = n;
            bottom--;
            for(int i = bottom ;i>=top;i--)
                mat[i][left] = n;
            left++;
            
            n--;
       }
       
       for(int i = 0 ; i<size; i++){
           
           for(int j=0; j<size; j++){
               System.out.print(mat[i][j]+" ");
           }
             System.out.println();
           
       }
       
       
       
           
    }
}