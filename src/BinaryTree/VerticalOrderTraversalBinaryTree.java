package BinaryTree;
import java.util.*;
public class VerticalOrderTraversalBinaryTree {
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (A==null)
            return ans;

        HashMap<Integer,ArrayList<Integer>> hashMap = new HashMap<>();

        Queue<QueueNode> queue = new LinkedList<>();

        int hd = 0;

        int min_d = Integer.MAX_VALUE;
        int max_d = Integer.MIN_VALUE;

        queue.add(new QueueNode(hd,A));

        while (!queue.isEmpty()){

            QueueNode curr = queue.poll();

            TreeNode treeNode = curr.node;
            hd = curr.hd;

            if (hashMap.containsKey(hd)){

                ArrayList<Integer> ar = hashMap.get(hd);
                ar.add(treeNode.val);
                hashMap.put(hd,ar);

            }else{
                ArrayList<Integer> ar = new ArrayList<>();
                ar.add(treeNode.val);
                hashMap.put(hd,ar);

            }


            if (min_d>hd)
                min_d = hd;
            if (max_d<hd)
                max_d = hd;



            if (treeNode.left!=null)
                queue.add(new QueueNode(hd-1,treeNode.left));
            if (treeNode.right!=null)
                queue.add(new QueueNode(hd+1,treeNode.right));



        }
        for (int i=min_d;i<=max_d;i++){
            ans.add(hashMap.get(i));
        }


        return ans;


    }


    static class QueueNode {

        public int hd;
        public TreeNode node;

        public QueueNode(int hd, TreeNode node) {
            this.hd = hd;
            this.node = node;
        }
    }

}
