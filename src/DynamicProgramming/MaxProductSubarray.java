package DynamicProgramming;

import java.util.*;
public class MaxProductSubarray {
    public int maxProduct(final List<Integer> ar) {

        if(ar.size()==0)
            return 0;

        int max = ar.get(0);
        int min = ar.get(0);

        int ans  = ar.get(0);

        for(int i=1;i<ar.size();i++){


            if(ar.get(i)<0){
                int temp = min;
                min = max;
                max = temp;
            }


            max = Math.max(ar.get(i),ar.get(i)*max);
            min = Math.min(ar.get(i),ar.get(i)*min);

            ans = Math.max(max,min);

        }




        return ans;

    }
}
