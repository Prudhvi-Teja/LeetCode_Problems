//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        // code here
        int org = n,temp=n;
        int count=0,sum=0;
        
        while(n!=0){
            count++;
            n/=10;
        }
        
        while(org!=0){
            
            sum +=Math.pow(org%10,count);
            org/=10;
        }
        
        if(temp == sum)
            return "Yes";
        else
            return "No";
        
    }
}