package Array;

import java.util.*;
public class MinStepsInInfiniteGrid {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {

        int ans = 0;

        int m = A.size();
        int n = B.size();

        if(m==0 || m==1)
            return 0;

        for(int i=1;i<m;i++){

            int x = Math.abs(A.get(i)-A.get(i-1));
            int y = Math.abs(B.get(i)-B.get(i-1));

            int max = Math.max(x,y);
            ans += max;

        }

        return ans;


    }
}
