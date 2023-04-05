//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int sizeOfArray = Integer.parseInt(read.readLine());
            int arr[] = new int[sizeOfArray];
            
            String st[] = read.readLine().trim().split("\\s+");
            for(int i = 0; i < sizeOfArray; i++)
              arr[i] = Integer.parseInt(st[i]);
              
            int x = Integer.parseInt(read.readLine());
            
            Solution obj = new Solution();
            
            System.out.println(obj.search(arr, sizeOfArray, x));
        }
    }
}
// } Driver Code Ends


class Solution{
        
    static int search(int arr[], int N, int X)
    {
        
        // Your code here
        // int left = 0;
        // int right = N-1;
        
        // while(left <= right){
            
        //     int mid = (left+right)>>1;
            
        //     if(arr[mid]==X)
        //         return mid;
            
        //     if(arr[mid] > X)
        //         right = mid-1;
        //     else
        //         left = mid+1;
        // }
        
        // return -1;
        
        for(int i =0; i < N ; i++){
            if(arr[i]==X)
                return i;
        }
        
        return -1;
        
    }
    
}
