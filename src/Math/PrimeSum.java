package Math;

import java.util.*;
public class PrimeSum {
    public int[] primesum(int A) {
        boolean[] sieve = new boolean[A+1];
        Arrays.fill(sieve,true);
        sieve[0] = false;
        sieve[1] = false;
        for(int i=2;i*i<=A;i++){
            if(sieve[i] == true){

                for(int j = i*i;j<=A;j=j+i){
                    if(sieve[j]==true)
                        sieve[j] = false;
                }
            }
        }
        int[] ans = new int[2];
        for(int i=2;i<=A;i++){
            if(sieve[i]==true && sieve[A-i]==true){
                ans[0] = i;
                ans[1] = A-i;
                return ans;
            }

        }
        return ans;
    }
}
