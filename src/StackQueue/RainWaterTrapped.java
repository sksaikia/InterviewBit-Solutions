package StackQueue;

import java.util.*;
public class RainWaterTrapped {
    public int trap(final List<Integer> ar) {

        int ans = 0;

        int[] left = left(ar);
        int[] right = right(ar);

        for (int i=0;i<ar.size();i++){
            int x = Math.min(left[i],right[i])-ar.get(i);
            if (x>0)
                ans +=x;
        }


        return ans;
    }

    private static int[] right(List<Integer> ar) {
        int[] ans = new int[ar.size()];

        ans[ar.size()-1] = ar.get(ar.size()-1);
        for (int i=ar.size()-2;i>=0;i--){
            ans[i] = Math.max(ans[i+1],ar.get(i));

        }

        return ans;
    }

    private  static  int[] left(List<Integer> ar) {

        int[] ans = new int[ar.size()];

        ans[0] = ar.get(0);

        for (int i=1;i<ar.size();i++){
            ans[i] = Math.max(ans[i-1],ar.get(i));
        }

        return ans;

    }

}
