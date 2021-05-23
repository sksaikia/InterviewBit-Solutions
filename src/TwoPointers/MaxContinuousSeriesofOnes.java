package TwoPointers;

import java.util.*;
public class MaxContinuousSeriesofOnes {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int m) {

        int count = 0;
        int i = 0;
        int j = 0;
        int start = -1;
        int end = -1;
        int n = A.size(), ans = 0;

        while (i < n && j < n) {

            if (A.get(j) == 0)
                count++;

            while (count > m) {


                if (j - i > ans) {
                    ans = j - i;
                    start = i;
                    end = j;
                }


                if (A.get(i) == 0)
                    count--;
                i++;
            }


            j++;
        }
        ArrayList<Integer> x = new ArrayList<>();

        for (i = start; i < end; i++)
            x.add(i);

        return x;

    }
}