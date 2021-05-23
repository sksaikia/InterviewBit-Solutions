package Strings;

public class PlaindromeString {
    public int isPalindrome(String str) {

        str = str.toLowerCase();
        str =   str.replaceAll("[^A-Za-z0-9]", "");

        //  System.out.println(str);


        int left = 0;
        int right = str.length()-1;

        while (left<right){

            char c= str.charAt(left);
            char d = str.charAt(right);

            if (c!=d)
                return 0;

            left++;
            right--;

        }




        return 1;

    }
}
