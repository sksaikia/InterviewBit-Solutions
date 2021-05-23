package Heap;

import java.util.*;
public class KthSmallestElementInTheArray {
    public int kthsmallest(final List<Integer> A, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();


        for(int i=0;i<A.size();i++){

            int x = A.get(i);

            pq.add(x);

        }

        for(int i=1;i<k;i++)
            pq.poll();

        return pq.poll();



    }
}
