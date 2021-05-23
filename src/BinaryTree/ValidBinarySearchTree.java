package BinaryTree;

public class ValidBinarySearchTree {
    public int isValidBST(TreeNode A) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        boolean a =  solve(A,min,max);

        if(a)
            return 1;
        return 0;

    }

    private boolean solve(TreeNode root,int min,int max){

        if(root==null)
            return true;

        if(root.val<min || root.val>max)
            return false;

        return solve(root.left,min,root.val) && solve(root.right,root.val,max);



    }
}
