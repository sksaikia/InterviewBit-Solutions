package Array;

import java.util.*;
public class FindDuplicateInArray {
    public int repeatedNumber(final List<Integer> A) {

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<A.size();i++){
            int x = A.get(i);

            if(hashSet.contains(x))
                return x;
            hashSet.add(x);

        }

        return -1;

    }
}
