package Math;

public class ExcelColumnTitle {
    public String convertToTitle(int n) {

        StringBuilder str = new StringBuilder();


        while (n>0){


            int x = n%26;

            if (x!=0) {

                char c = (char) (x - 1 + 'A');

                str.append(c);
                n = n/26;

            }else{
                str.append('Z');
                n = (n/26)-1;
            }





        }

        return reverse(String.valueOf(str));

    }
    private static String reverse(String str) {

        char[] ar = str.toCharArray();

        int left = 0;
        int right = str.length()-1;

        while (left<right){

            char c = ar[left];
            ar[left] = ar[right];
            ar[right] = c;
            left++;
            right--;

        }


        return new String(ar);

    }
}
