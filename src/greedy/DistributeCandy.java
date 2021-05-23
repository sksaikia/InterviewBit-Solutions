package greedy;

import java.util.*;
public class DistributeCandy {
    public int candy(ArrayList<Integer> A) {

        int sum = 0;

        int n = A.size();

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        Arrays.fill(left,1);
        Arrays.fill(right,1);


        for(int i=1;i<n;i++){

            int x = A.get(i);
            int y = A.get(i-1);

            if(x>y)
                ans[i] = ans[i-1] + 1;


        }



        return sum;

    }
}
