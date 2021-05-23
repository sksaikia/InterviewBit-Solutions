package Math;

public class LargestCoprimeDivisor {
    public int cpFact(int A, int B) {

        while(gcd(A,B)!=1){

            A = A/gcd(A,B);
        }

        return A;
    }

    private int gcd(int A,int B){

        if(A==0)
            return B;
        return gcd(B%A,A);

    }
}
