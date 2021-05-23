package BinaryTree;

public class MinDepthOfBinaryTree {
    static int ans = Integer.MAX_VALUE;

    public int minDepth(TreeNode A) {

        ans = 0;
        solve(A,0);


        if(ans == Integer.MAX_VALUE)
            return 1;
        return ans;


    }

    private static void solve(TreeNode root,int level){
        if(root==null)
            return;

        if(root.left==null && root.right==null){
            ans = Math.min(ans,level);
        }

        solve(root.left,level+1);
        solve(root.right,level+1);


    }
    }
