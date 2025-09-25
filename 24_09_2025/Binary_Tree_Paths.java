import java.util.List;
import java.util.ArrayList;

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if(root == null) return res;

        Dfs(root, res, new StringBuilder());
        return res;
    }

    public void Dfs(TreeNode node,List<String> res, StringBuilder sb){
        if (node==null) return;

        // path += node.val;
        // if(node.left == null && node.right == null){
        //     res.add(path);
        // }
        // else{
        //     path += "->";
        //     Dfs(node.left,path,res);
        //     Dfs(node.right,path,res);
        // }

        int len = sb.length();
        sb.append(node.val);
        if(node.left==null && node.right==null){
            res.add(sb.toString());
            
        }else{
            sb.append("->");
            Dfs(node.left,res,sb);
            Dfs(node.right,res,sb);
        }
        sb.setLength(len);
    }
}