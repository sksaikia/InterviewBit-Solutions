package BinaryTree;
import java.util.*;
public class kthSmallestElementIntree {
    static ArrayList<Integer> list;
    public int kthsmallest(TreeNode A, int B) {

        list = new ArrayList<>();

        inOrder(A);

        return list.get(B-1);


    }
    public void inOrder(TreeNode root){

        if(root==null)
            return ;

        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);

    }

}
