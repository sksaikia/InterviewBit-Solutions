package TwoPointers;

import java.util.*;
public class ThreeSum {
    public int threeSumClosest(ArrayList<Integer> A, int B) {


        Collections.sort(A);

        int ans = Integer.MAX_VALUE;


        for(int i=0;i<A.size() && ans!=0;i++){

            int left = i+1;
            int right = A.size()-1;

            while(left<right){

                int sum = A.get(i) + A.get(left) + A.get(right);


                if(Math.abs(B-sum)<Math.abs(ans))
                    ans = B-sum;

                if(sum<B)
                    left++;
                else
                    right--;





            }

        }

        return B- ans;

    }
}
