/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> l = new ArrayList<>();
    List<Integer> r = new ArrayList<>();
    
    
    public void getLeaves(TreeNode root, List list){
        
        if(root== null)
            return;
        
        if(root.left == null && root.right == null)
            list.add(root.val);
        
        getLeaves(root.left,list);
        getLeaves(root.right,list);
        
    }
    
    
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        getLeaves(root1,l);
        getLeaves(root2,r);
        
        if(l.size() == r.size()){
            
            for(int i=0; i<l.size(); i++){
                if(l.get(i) != r.get(i) )
                    return false;
            }
            
            return true;
        }
            
        return false;
    }
}