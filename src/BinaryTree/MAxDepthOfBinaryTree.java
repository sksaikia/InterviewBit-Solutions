package BinaryTree;

public class MAxDepthOfBinaryTree {
    public int maxDepth(TreeNode A) {

        if(A==null)
            return 0 ;

        int l = maxDepth(A.left);
        int r = maxDepth(A.right);

        if(l>r)
            return 1+l;
        return 1+r;


    }
}
