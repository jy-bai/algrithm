package tree;

import java.util.*;

public class LevelOrder {

    private class TreeNode{
        public int val;
        public TreeNode left,right;
        TreeNode(int x){
            val=x;
        }
    }

    public static int[] levelOrder(TreeNode root){
        // use linked list
        if(root==null){
            return new int[0];
        }

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        ArrayList<Integer> arr=new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node=queue.remove();
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
            arr.add(node.val);
        }
        // convert arraylist to array
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
    
}