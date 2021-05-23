package Strings;

public class AmazingSubarray {
    public int solve(String str) {


        int ans  = 0;

        for (int i=0;i<str.length();i++){

            char c = str.charAt(i);

            if (isVowel(c)){
                ans  += str.length()-i;
                //   System.out.println(ans);
            }

        }

        return ans%10003 ;


    }



    public static boolean isVowel(char c){

        switch (c){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }


        return false  ;
    }

}
