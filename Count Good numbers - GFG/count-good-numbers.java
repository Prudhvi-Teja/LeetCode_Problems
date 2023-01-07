//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            long N;
            N = Long.parseLong(br.readLine().trim());

            Solution obj = new Solution();
            int res = obj.countGoodNumbers(N);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    
    static long mod = 1000000007;
    
     public static long pow(int a, long b){
        if(b==0)
            return 1;
        if(b==1)
            return a;

        long t = pow(a,b/2);

        if(b%2==1)
            return (t*t*a) % mod;
        else
            return (t*t) % mod;

    } 
    
    public static int countGoodNumbers(long N) {
        // code here
        long even = N/2;
        long odd = N/2;
        
        if((N&1)==1)
            even +=1;
        
        long a = pow(4,odd);
        long b = pow(5,even);
        
        return (int)((a*b)%mod);
        
        
    }
}
