package BinaryTree;

public class SortedArrayUToBalancedBST {
    public TreeNode sortedArrayToBST(final int[] A) {

        return solve(A,0,A.length-1);

    }

    private TreeNode solve(final int[] A,int left,int right){


        if(left>right)
            return null;


        int mid = left + (right-left)/2;


        TreeNode node = new TreeNode( A[mid] );
        node.left = solve(A,left,mid-1);
        node.right = solve(A,mid+1,right);


        return node;


    }

}
