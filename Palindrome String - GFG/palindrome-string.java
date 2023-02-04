//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        return checkPalindrome(S,0,S.length()-1) ? 1 : 0;
    }
    
    boolean checkPalindrome(String s,int low ,int high){
        if(low >= high)
            return true;
            
        if(s.charAt(low) == s.charAt(high))
            return checkPalindrome(s,low+1,high-1);
        else
            return false;
    }
    
    
}