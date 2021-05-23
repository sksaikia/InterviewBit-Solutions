package DynamicProgramming;

public class LongestPalindromicSubsequence {
    public int solve(String a) {

        String b = reverse(a);

        int m = a.length();


        int[][] dp = new int[m+1][m+1];


        for(int i=1;i<=m;i++){

            for(int j=1;j<=m;j++){

                if(a.charAt(i-1)==b.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);



            }

        }



        return dp[m][m];


    }

    private static String reverse(String a){

        char[] ar = a.toCharArray();

        int left = 0;
        int right = a.length()-1;


        while(left<right){

            char c = ar[right];
            ar[right] = ar[left];
            ar[left] = c;
            left++;
            right--;

        }


        return new String(ar);


    }

}
