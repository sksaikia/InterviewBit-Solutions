package greedy;

import java.util.*;
public class Bulbs {
    public int bulbs(ArrayList<Integer> A) {

        int n = A.size();

        int state = 0;

        int count = 0;

        for(int i= 0;i<n;i++){

            if(state!=A.get(i)){
                count++;
                state = A.get(i);
            }

        }


        return count;


    }
}
