package BinaryTree;
import java.util.*;
public class RightViewOfBinaryTree {

    static int max = 0;

    public ArrayList<Integer> solve(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();
        max = 0;

        if(A==null)
            return ans;

        solve(A,ans,1);

        return ans;


    }
    private static  void solve(TreeNode A, ArrayList<Integer> ans,int level){

        if(A==null)
            return;

        if(level>max){
            ans.add(A.val);
            max = level;
        }

        solve(A.right,ans,level+1);
        solve(A.left,ans,level+1);


    }

}
