package BinaryTree;
import java.util.*;
public class InorderTraversal {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {



        Stack<TreeNode> stack = new Stack<>();

        ArrayList<Integer> ans = new ArrayList<>();

        if(A==null)
            return ans;

        TreeNode curr = A;

        while(!stack.isEmpty() || curr!=null ){


            while(curr!=null){

                stack.push(curr);

                curr = curr.left;

            }


            curr = stack.pop();

            ans.add(curr.val);

            curr = curr.right;


        }
        return ans;

    }



}
