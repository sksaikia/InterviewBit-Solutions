package BinaryTree;
import java.util.*;
public class DiagonalTraversal {
    public ArrayList<Integer> solve(TreeNode A) {

        ArrayList<Integer> ans = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();

        if(A==null)
            return ans;

        queue.add(A);
        queue.add(null);

        while(!queue.isEmpty()){

            TreeNode curr = queue.poll();


            if(curr==null){

                if(queue.size()==0)
                    break;
                else
                    queue.add(null);
            }else{

                while(curr!=null){

                    ans.add(curr.val);
                    if(curr.left!=null)
                        queue.add(curr.left);

                    curr = curr.right;

                }


            }


        }


        return ans;



    }

            }
