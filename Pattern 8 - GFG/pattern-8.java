//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj=new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
       
       
        for(int i = n-1 ; i >= 0 ; i--){
            
            
            int toc = 2 * i + 1;
            int soc = n + i - toc;
            
            for(int j = 0 ; j < soc ; j++)
                System.out.print(" ");
            for(int k = 0 ; k < toc ; k++)
                System.out.print("*");
            
            System.out.println();
        }
        
        
    }
}