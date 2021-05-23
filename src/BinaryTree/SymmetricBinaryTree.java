package BinaryTree;

public class SymmetricBinaryTree {
    public int isSymmetric(TreeNode A) {

        if(A==null)
            return 1;

        boolean ans = solve(A.left,A.right);
        if(ans==true)
            return 1;
        return 0;

    }


    private boolean solve(TreeNode root1,TreeNode root2){

        if(root1==null && root2==null)
            return true;

        if(root1==null || root2==null)
            return false;

        if(root1.val!=root2.val)
            return false;

        return solve(root1.left,root2.right) && solve(root1.right,root2.left);


    }

}
