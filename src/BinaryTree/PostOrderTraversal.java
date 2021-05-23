package BinaryTree;
import java.util.*;
public class PostOrderTraversal {
    static ArrayList<Integer> ans;

    public ArrayList<Integer> postorderTraversal(TreeNode A) {

        ans = new ArrayList<>();

        solve(A);
        return ans;


    }

    private static void solve(TreeNode root){
        if(root==null)
            return;

        solve(root.left);
        solve(root.right);

        ans.add(root.val);



    }


}
