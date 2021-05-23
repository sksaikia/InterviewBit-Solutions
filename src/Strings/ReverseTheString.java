package Strings;

public class ReverseTheString {
    public String solve(String str) {


        String[] ar = str.split("\\s+");

        StringBuilder s = new StringBuilder();

        for(int i = ar.length-1;i>=0;i--){

            s.append(ar[i].trim());
            if(i>0)
                s.append(" ");

        }
        return String.valueOf(s);

    }
}
