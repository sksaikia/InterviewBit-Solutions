package DynamicProgramming;

import java.util.*;
public class LengthOfLongestSubsequence {
    public int longestSubsequenceLength(final List<Integer> A) {

        int n = A.size();

        if(n==0)
            return 0;

        int[] left = new int[n];
        int[] right = new int[n];

        Arrays.fill(left,1);
        Arrays.fill(right,1);

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(A.get(i)>A.get(j) && left[j]+1>left[i])
                    left[i] = left[j] + 1;
            }
        }


        for(int i=n-2;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if(A.get(i)>A.get(j) && right[j]+1>right[i])
                    right[i] = right[j]+1;
            }

        }
        int ans = 0;

        for(int i=0;i<n;i++)
            ans = Math.max(ans,left[i]+right[i]-1);


        return ans;

    }
}
