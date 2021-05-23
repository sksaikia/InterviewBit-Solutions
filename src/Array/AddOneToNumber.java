package Array;

import java.util.*;
public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        ArrayList<Integer> ans = new ArrayList<>();

        int carry = 1;
        int[] ar = new int[A.size()];

        for (int i = A.size()-1;i>=0;i--){

            int val = A.get(i)+carry;
            ar[i] = val%10;
            carry = val/10;


        }
        if (carry==1){
            ans.add(1);
            for (int c:ar)
                ans.add(c);
            return ans;
        }

        boolean isSet = false;
        for (int i=0;i<ar.length;i++) {
            if (!isSet && ar[i]==0)
                continue;
            ans.add(ar[i]);
            isSet = true;
        }


        return ans;




    }

    }
