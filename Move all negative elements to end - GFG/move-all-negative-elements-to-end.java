//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        
        int count1 = 0,count2=0;
        
        for(int a : arr){
            if(a < 0)
                count1++;
            else
                count2++;
        }
        
        int[] arr1 = new int[count1];
        int[] arr2 = new int[count2];
        int i=0,j=0;
        for(int k=0; k < n ; k++){
            if(arr[k] < 0)
                arr1[i++] = arr[k];
            else
                arr2[j++] = arr[k];
        }
        
        for(i =0; i < count2; i++){
            arr[i] = arr2[i];
        }
        
        for(int k= 0; k <count1; i++){
            arr[i] = arr1[k++];
        }
        
        
    }
}