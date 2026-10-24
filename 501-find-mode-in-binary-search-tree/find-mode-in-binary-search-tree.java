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
    int currentValue;
    int currentCount = 0;
    int maxCount = 0;
    List<Integer> modes = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inorder(root);

        int[] result = new int[modes.size()];

        for( int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }

        return result;

        
    }

    private void inorder(TreeNode node) {
        if( node == null) {
            return;
        }
        inorder(node.left);

        if( currentCount == 0 || node.val != currentValue) {
            currentValue = node.val;
            currentCount = 1;
        } else {
            currentCount++;
        }
        if( currentCount > maxCount) {
            maxCount = currentCount;
            modes.clear();
            modes.add (currentValue);
         } else if (currentCount == maxCount) {
                modes.add(currentValue);
            }
        inorder( node.right);

    }
}