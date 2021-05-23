package BitManipulation;

public class ReverseBits {
    public long reverse(long a) {

        long res = 0;
        int power = 31;

        while(a!=0){

            int x = (int) (a&1)<<power;

            res += x;

            a= a>>1;

            power--;

        }

        return res;


    }
}
