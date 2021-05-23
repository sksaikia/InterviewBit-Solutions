package Math;

public class PalindromeInteger {
    public int isPalindrome(int A) {

        int rev = 0;
        int B = A;

        while(B>0){

            int c = B%10;
            rev = rev*10 + c;
            B = B/10;


        }

        if(rev==A)
            return 1;
        return 0;

    }
}
