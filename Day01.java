/*2265. Count Nodes Equal to Average of Subtree
Question link:-https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/description/
My Solution in Java:-Day 01 of 75
 */
class Solution {
    private int ct=0;
    public int averageOfSubtree(TreeNode root) {
        if(root==null){
            return ct;
        }
        postorder(root);
        return ct;
        
    }
    private int[] postorder(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int []left=postorder(root.left);
        int []right=postorder(root.right);
        int total=left[0]+right[0]+root.val;
        int tnode=left[1]+right[1]+1;
        if(total/tnode==root.val){
            ct++;
        }
        return new int[]{total,tnode};
    }
}