package greedy;

import java.util.*;
public class Seats {
    public int seats(String str) {

        if (str.length() == 0)
            return 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'x')
                list.add(i);
        }
        if (list.size() == 0)
            return 0;

        int center = 0;
        int mid = 0;
        mid = list.size() / 2;

        center = list.get(mid);


        int start = 0;
        int end = 0;

        int ans = 0;

        for (int i = 0; i < list.size(); i++) {

            start = list.get(i);
            end = center - mid + i;
            ans = (ans + Math.abs(start - end)) % 10000003;

        }
        return ans % 10000003;

    }
    }
