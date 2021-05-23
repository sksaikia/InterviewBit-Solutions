package BinaryTree;
import java.util.*;
public class ZigZagLevelOrderTraversal {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (A == null)
            return ans;

        Queue<TreeNode> queue = new LinkedList<>();


        queue.add(A);


        int level = 1;

        while (!queue.isEmpty()) {

            int k = queue.size();

            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> curr = new ArrayList<>();

            for (int i = 1; i <= k; i++) {

                TreeNode currNode = queue.poll();


                if (level % 2 == 1)
                    curr.add(currNode.val);
                else
                    stack.add(currNode.val);


                if (currNode.left != null)
                    queue.add(currNode.left);
                if (currNode.right != null)
                    queue.add(currNode.right);


            }
            if (level % 2 == 1)
                ans.add(curr);
            else {

                ArrayList<Integer> c = new ArrayList<>();

                while (!stack.isEmpty())
                    c.add(stack.pop());

                ans.add(c);
            }

            level++;


        }

        return ans;


    }


}