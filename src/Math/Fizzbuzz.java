package Math;

public class Fizzbuzz {
    public String[] fizzBuzz(int A) {

        String[] ar = new String[A];

        for(int i=1;i<=A;i++){

            if(i%3==0 && i%5==0)
                ar[i-1] = "FizzBuzz";
            else if(i%5==0)
                ar[i-1] = "Buzz";
            else if(i%3==0)
                ar[i-1] = "Fizz";
            else
                ar[i-1] = String.valueOf(i);

        }

        return ar;

    }
}
