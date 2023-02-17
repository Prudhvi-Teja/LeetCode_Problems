//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends

// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> list = new ArrayList<>();
        
        solvePath(m,n,0,0,"",list);
        
        return list;
        
    }
    
    public static void solvePath(int[][] m,int n,int i, int j,String curStr,List<String> list){
        
        if(i < 0 || j < 0 || i >= n || j >= n || m[i][j]==0)    return;
        
        if(i==n-1 && j==n-1){
            if(m[i][j]==1)
                list.add(curStr);
            return;
        }
        //To track the visited ones
        m[i][j] = 0;
        
        //Left Cell
        solvePath(m,n,i,j-1,curStr+"L",list);
        //Right Cell
        solvePath(m,n,i,j+1,curStr+"R",list);
        //Upper cell
        solvePath(m,n,i-1,j,curStr+"U",list);
        //Down Cell
        solvePath(m,n,i+1,j,curStr+"D",list);
        
        //backtrack for finding different paths
        
        m[i][j] = 1;
    }
}