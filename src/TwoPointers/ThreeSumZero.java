package TwoPointers;

import java.util.*;
public class ThreeSumZero {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> list) {

        HashSet<ArrayList<Integer>> ans = new HashSet<>();

        Collections.sort(list);

        for (int i=0;i<list.size();i++){

            int left = i+1;
            int right = list.size()-1;

            while (left<right){

                int sum = list.get(i) + list.get(left) + list.get(right);

                if (sum==0) {
                    ArrayList<Integer> curr = new ArrayList<>();
                    curr.add(list.get(i));
                    curr.add(list.get(left));
                    curr.add(list.get(right));
                    left++;
                    right--;
                    ans.add(curr);
                }else if (sum<0)
                    left++;
                else
                    right--;



            }

        }
        ArrayList<ArrayList<Integer>> returnThis = new ArrayList<>();

        Iterator it = ans.iterator();
        while (it.hasNext()){

            ArrayList<Integer> c = (ArrayList<Integer>) it.next();
            returnThis.add(c);

        }


        return returnThis;



    }
}
