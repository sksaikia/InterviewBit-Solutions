package TwoPointers;

import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(ArrayList<Integer> a) {


        int n = a.size();

        int j = 0;

        for(int i=0;i<n-1;i++){

            if(a.get(i).intValue()!=a.get(i+1).intValue()){
                a.set(j, a.get(i));
                j++;

            }

        }
        a.set(j,a.get(n-1));


        return j+1;

    }
}
