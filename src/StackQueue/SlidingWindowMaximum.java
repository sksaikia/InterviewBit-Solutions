package StackQueue;

import java.util.*;
public class SlidingWindowMaximum {
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {

        if(null == A || A.isEmpty()){
            return null;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        LinkedList<Integer> window = new LinkedList<Integer>();

        // Create first window of B elements
        for(int i=0; i<B; i++){
            int current = A.get(i);
            // Remove all elements from end which are smaller than current
            while(!window.isEmpty() && A.get(window.peekLast()) <= current){
                window.removeLast();
            }
            window.add(i);
        }
        result.add(A.get(window.peekFirst()));

        for(int i=B; i<A.size(); i++){
            // Remove first so size of window remains B
            if(window.peekFirst() + B <= i){
                window.removeFirst();
            }
            int current = A.get(i);
            // Remove all elements from end which are smaller than current
            while(!window.isEmpty() && A.get(window.peekLast()) <= current){
                window.removeLast();
            }
            window.add(i);
            result.add(A.get(window.peekFirst()));
        }
        return result;
    }
}
