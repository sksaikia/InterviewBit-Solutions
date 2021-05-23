package TwoPointers;

import java.util.*;
public class SortByColor {
    public void sortColors(ArrayList<Integer> a) {

        int n =a.size();

        int i=0,j=0;

        int count0=0,count1=0;

        for( i=0;i<n;i++){

            int x = a.get(i);

            if(x==0)
                count0++;
            if(x==1)
                count1++;

        }

        for(i=0;i<count0;i++)
            a.set(i,0);

        for(;i<count0+count1;i++)
            a.set(i,1);

        for(;i<n;i++)
            a.set(i,2);




    }
}
