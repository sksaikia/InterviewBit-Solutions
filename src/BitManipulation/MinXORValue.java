package BitManipulation;

import java.util.*;
public class MinXORValue {

    public int findMinXor(ArrayList<Integer> A) {

        Collections.sort(A);

        int min = Integer.MAX_VALUE;

        for(int i=0;i<A.size()-1;i++){

            int x = A.get(i).intValue() ^ A.get(i+1).intValue();
            min= Math.min(min,x);

        }


        return min;
    }
}
