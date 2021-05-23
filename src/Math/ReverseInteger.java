package Math;

public class ReverseInteger {
    public int reverse(int A) {
        boolean state = false;

        if(A<0)
            state = true;


        int B = Math.abs(A);
        int rev = 0;

        while(B>0){

            int c = B%10;
            rev = rev*10 + c;

            B = B/10;


        }
        if(rev>Integer.MAX_VALUE)
            return 0;

        if(state==true)
            rev = rev * (-1);


        return rev;

    }
}
