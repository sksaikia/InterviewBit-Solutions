package greedy;

import java.util.*;
public class GasStation {

    public int canCompleteCircuit(final List<Integer> petrol, final List<Integer> distances) {

        int n = petrol.size();

        if (n == 0)
            return -1;

        if (n == 1) {
            if (petrol.get(0) >= distances.get(0))
                return 0;
            else
                return -1;
        }


        int start = 0;
        int end = 1;
        int curr = petrol.get(start) - distances.get(start);

        while (end != start || curr < 0) {

            while (end != start && curr < 0) {

                curr = curr - (petrol.get(start) - distances.get(start));

                start = (start + 1) % n;

                if (start == 0)
                    return -1;


            }
            curr = curr + (petrol.get(end) - distances.get(end));
            end = (end + 1) % n;


        }

        return start;


    }
}
