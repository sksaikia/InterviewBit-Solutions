package Hashing;

import java.util.*;
public class ColorfulNumber {
    static ArrayList<String> list = new ArrayList<>();

    public int colorful(int n) {

        list = new ArrayList<>();

        generateSubSeq(String.valueOf(n),-1,String.valueOf(n).length(),"");

        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<list.size();i++){

            int curr = Integer.parseInt(list.get(i));

            int x = checkProduct(curr);

            //    System.out.print(x + " ");
            if (hashSet.contains(x)) {
                //  System.out.println(x + " is repeated ");
                return 0;
            }

            hashSet.add(x);
        }

        return 1;


    }
    private static int checkProduct(int n){

        int prod = 1;


        while(n>0){
            int x = n%10;

            prod *= x;

            n = n/10;


        }

        return prod;

    }

    private static void generateSubSeq(String no,int i,int n , String curr){



        for (int j=0;j<n;j++){
            for (int k=j;k<n;k++){
                list.add(no.substring(j,k+1));
            }

        }

    }



}
