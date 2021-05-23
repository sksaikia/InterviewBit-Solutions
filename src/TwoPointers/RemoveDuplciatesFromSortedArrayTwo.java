package TwoPointers;

import java.util.*;
public class RemoveDuplciatesFromSortedArrayTwo {
    public int removeDuplicates(ArrayList<Integer> a) {

        int n = a.size();

        if(n<=2)
            return n;

        int i=0;
        int count =1;

        for(int j=1;j<n;j++){

            int first = a.get(i);
            int second = a.get(j);

            if(first<second){
                a.set(++i,second);
                count=1;
            }else{

                count++;
                if(count<=2){

                    a.set(++i,second);
                }

            }


        }

        return i+1;


    }
}
