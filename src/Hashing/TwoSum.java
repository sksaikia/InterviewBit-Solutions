package Hashing;

import java.util.*;
public class TwoSum {
    public ArrayList<Integer> twoSum(final List<Integer> ar, int target) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<ar.size();i++){

            int x = ar.get(i);

            if(hashMap.containsKey(target-x)){
                res.add(hashMap.get(target-x)+1);
                res.add(i+1);
                return res;
            }

            if(hashMap.containsKey(x)){

            }else{
                hashMap.put(x,i);

            }

        }

        return res;

    }
}
