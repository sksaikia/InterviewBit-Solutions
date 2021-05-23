package Array;

import java.util.*;
public class LargestNumber {
    public String largestNumber(final int[] ar) {


        ArrayList<Integer> list = new ArrayList<>();

        for (int c:ar)
            list.add(c);


        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //   System.out.println(o1 + "  " + o2);
                String s1 = o1+""+o2;
                String s2 = o2+""+o1;
                //   System.out.println("s1 : " + s1 + " s2 : " + s2 + " " + s1.compareTo(s2));
                if (s1.compareTo(s2)>0)
                    return -1;
                else
                    return 1;
            }
        });



        StringBuilder str = new StringBuilder();

        for (int i=0;i<list.size();i++){
            // System.out.println("Printing : " + list.get(i));
            str.append(list.get(i));
        }
        return String.valueOf(str);



    }

    }
