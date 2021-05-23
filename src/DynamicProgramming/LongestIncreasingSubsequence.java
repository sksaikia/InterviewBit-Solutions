package DynamicProgramming;

import java.util.*;
public class LongestIncreasingSubsequence {
    public int lis(final List<Integer> A) {

        int n = A.size();

        int[] dp = new int[n];

        Arrays.fill(dp,1);


        for(int i=1;i<n;i++){

            for(int j=0;j<i;j++){

                if(A.get(j)<A.get(i) && dp[j]+1>dp[i])
                    dp[i] = dp[j]+1;

            }

        }

        int max = 0;
        for(int i=0;i<n;i++)
            max = Math.max(max,dp[i]);


        return max;
    }
}
