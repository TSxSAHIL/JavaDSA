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
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i = 0; i<levelSize ; i++){
                TreeNode currentNode = q.poll();
                l.add(currentNode.val);
                if(currentNode.left != null){
                    q.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    q.offer(currentNode.right);
                }
            }
            res.add(l);
        }
        List<Double> list = new ArrayList<>();
        for(int i = 0 ; i<res.size() ; i++){
            for(int j = 0 ; j<res.get(i).size() ; j++){
                int sum = res.get(i,j);
                list.add(sum);
            }
        }
        return list;
    }
}