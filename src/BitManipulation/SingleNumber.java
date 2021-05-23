package BitManipulation;

import java.util.*;
public class SingleNumber {
    public int singleNumber(final List<Integer> A) {

        int n = A.size();

        if(n==0)
            return 0;
        if(n==1)
            return A.get(0);

        int res = 0;
        for(int i=1;i<n;i++){

            res = res^ A.get(i);

        }

        return res;
    }
}
