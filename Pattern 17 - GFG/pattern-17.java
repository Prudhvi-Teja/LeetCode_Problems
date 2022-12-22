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
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        char[] arr = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
            'Q','R','S','T','U','V','W','X','Y','Z'};
        
        for(int i =0 ; i < n ; i++){
            
            int toc = 2 * i + 1;
            int soc = n + i - toc;
            
            for(int j = 0 ; j<soc; j++)
                System.out.print(" ");
            for(int j=0; j<toc-i;j++)
                System.out.print(arr[j]);
            for(int j = toc-i-2; j>=0; j--)
                System.out.print(arr[j]);
            System.out.println();
        }
        
    }
}