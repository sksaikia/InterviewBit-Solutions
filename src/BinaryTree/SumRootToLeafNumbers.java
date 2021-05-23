package BinaryTree;
import java.util.*;
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode A) {

        //   ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();

        solve(A,curr,0);

        int sum = 0;

        for(int c : curr)
            sum  = (sum+c)%1003;


        return sum;
    }

    private void solve(TreeNode root, ArrayList<Integer> curr,int sum){


        if(root==null)
            return;

        sum = (sum*10) + root.val;

        if(root.left==null && root.right==null){
            curr.add(sum);
            return;
        }

        solve(root.left,curr,sum);
        solve(root.right,curr,sum);



    }
}
