package BinaryTree;

public class PathSum {
    public int hasPathSum(TreeNode A, int B) {


        boolean x = solve(A,B);

        if(x)
            return 1;
        return 0;

    }

    private boolean solve(TreeNode root,int sum){

        if(root==null)
            return false;

        if(root.left==null && root.right==null && sum-root.val==0)
            return true;

        return solve(root.left,sum-root.val) || solve(root.right,sum-root.val);


    }


}
