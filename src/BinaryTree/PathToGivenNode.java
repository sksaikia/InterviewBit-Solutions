package BinaryTree;
import java.util.*;
public class PathToGivenNode {
    public ArrayList<Integer> solve(TreeNode A, int B) {

        ArrayList<Integer> list = new ArrayList<>();

        method(A,B,list);

        return list;
    }

    private boolean method(TreeNode root,int b,ArrayList<Integer> list){

        if(root==null)
            return false;

        list.add(root.val);

        if(root.val==b)
            return true;

        if(method(root.left,b,list) || method(root.right,b,list))
            return true;


        list.remove(list.size()-1);

        return false;
    }

}
