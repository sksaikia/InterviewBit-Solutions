package Math;

public class GreatestCommonDivisor {
    public int gcd(int A, int B) {
        if(A==0)
            return B;
        return gcd(B%A,A);

    }
}
