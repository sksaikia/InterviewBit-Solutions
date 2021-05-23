package Array;

import java.util.*;
public class LeadersInAnArray {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = A.size();

        int max = A.get(n-1);

        ans.add(max);

        for(int i=n-2;i>0;i--){

            if(A.get(i)>max){
                max = A.get(i);
                ans.add(0,max);
            }


        }


        return ans;

    }
}
