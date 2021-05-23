package BinaryTree;
import java.util.*;
public class PreorderTraversal {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();


        if(A==null)
            return ans;

        stack.add(A);
        TreeNode curr = A;

        while(!stack.isEmpty()){


            curr = stack.pop();
            ans.add(curr.val);


            if(curr.right!=null)
                stack.push(curr.right);
            if(curr.left!=null)
                stack.push(curr.left);



        }


        return ans;


    }
}
