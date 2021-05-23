package TwoPointers;

import java.util.*;
public class IntersectionOfSortedArrays {
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<A.size();i++){

            int x = A.get(i);

            if(hashMap.containsKey(x))
                hashMap.put(x,hashMap.get(x)+1);
            else
                hashMap.put(x,1);

        }
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<B.size();i++){

            int x = B.get(i);

            if(hashMap.containsKey(x)){

                if(hashMap.get(x)>=1){
                    ans.add(x);
                    hashMap.put(x,hashMap.get(x)-1);
                }

            }


        }


        return ans;



    }
}

