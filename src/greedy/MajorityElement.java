package greedy;

import  java.util.*;
public class MajorityElement {
    public int majorityElement(final List<Integer> A) {

        int n = A.size();


        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<n;i++){

            int x = A.get(i);

            if(hashMap.containsKey(x)){
                hashMap.put(x,hashMap.get(x)+1);
                if(hashMap.get(x)>=n/2)
                    return x;
            }else
                hashMap.put(x,1);


        }

        return -1;



    }
}
