package BinaryTree;
import java.util.*;
import BinaryTree.TreeNode;

import java.util.*;
public class LevelOrder {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {

        Queue<TreeNode> queue = new LinkedList<>();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        if(A==null)
            return list;

        queue.add(A);

        while(!queue.isEmpty()){

            int size = queue.size();

            ArrayList<Integer> ans = new ArrayList<>();

            for(int i=1;i<=size;i++){


                TreeNode curr = queue.poll();

                ans.add(curr.val);

                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);


            }

            list.add(ans);


        }



        return list;

    }
}

