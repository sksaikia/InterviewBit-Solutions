package greedy;

import java.util.*;
public class HighestProduct {
    public int maxp3(ArrayList<Integer> A) {

        int ans = 0;

        int n = A.size();
        if(n<2)
            return 0;


        Collections.sort(A);

        ans = A.get(n-1) * A.get(n-2) * A.get(n-3);

        ans = Math.max(ans,A.get(0)*A.get(1)*A.get(n-1));


        return ans;



    }
}
