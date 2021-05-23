package Array;

import java.util.*;
public class MaxMin {
    public int solve(ArrayList<Integer> A) {

        Collections.sort(A);

        if(A.size()<2)
            return 0;

        return A.get(0) + A.get(A.size()-1);

    }
}
