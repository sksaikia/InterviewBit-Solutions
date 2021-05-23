package BinaryTree;
import java.util.*;
public class RootToLeafPathsWithSum {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();

        solve(A,B,curr,ans);

        return ans;


    }

    private static void solve(TreeNode root,int sum,
                              ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> ans){

        if(root==null)
            return ;

        curr.add(root.val);

        if(root.left==null && root.right==null && sum-root.val==0){

            ans.add(curr);
            return;
        }

        solve(root.left,sum-root.val,new ArrayList<>(curr),ans);
        solve(root.right,sum-root.val,new ArrayList<>(curr),ans);



    }

}
