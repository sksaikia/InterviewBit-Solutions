package BinaryTree;

public class IdenticalBinaryTree {
    public int isSameTree(TreeNode A, TreeNode B) {

        boolean ans = solve(A,B);

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

        return solve(root1.left,root2.left) && solve(root1.right,root2.right);


    }


}
