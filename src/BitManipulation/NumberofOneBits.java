package BitManipulation;

public class NumberofOneBits {
    public int numSetBits(long a) {

        int count = 0;

        while(a>0){

            int x = (int) a&1;
            if(x==1)
                count++;

            a = a>>1;

        }

        return count;

    }
}

