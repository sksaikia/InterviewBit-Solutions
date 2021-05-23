package Math;

import java.util.*;
public class UniquePathsInAGrid {

    public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {


        int m = A.size();

        if (m == 0)
            return 0;
        int n = A.get(0).size();

        int[][] mat = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = A.get(i).get(j);
            }
        }
        if (mat[0][0] == 1)
            return 0;


        int[][] dp = new int[m][n];

        dp[0][0] = 1;

        for (int i = 1; i < m; i++) {
            if (mat[i][0] == 0)
                dp[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            if (mat[0][i] == 0)
                dp[0][i] = 1;

        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][j] == 0)
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];

    }
    }
