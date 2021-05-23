package Array;

import java.util.*;
public class MaxSumContiguousSubarray {
    public int maxSubArray(final List<Integer> A) {

        int n = A.size();

        if(n==0)
            return 0;

        int max = A.get(0);
        int curr = A.get(0);


        for(int i=1;i<n;i++){

            curr += A.get(i);

            if(A.get(i)>curr)
                curr = A.get(i);


            max = Math.max(curr,max);


        }


        return max;


    }
}
