package greedy;

import java.util.*;
public class MeetingRooms {
    public int solve(ArrayList<ArrayList<Integer>> A) {

        int[] arr = new int[A.size()];
        int[] dep = new int[A.size()];

        for(int i=0;i<A.size();i++){

            arr[i] = A.get(i).get(0);
            dep[i] = A.get(i).get(1);

        }

        Arrays.sort(arr);
        Arrays.sort(dep);

        int n =A.size();

        int max = 1;
        int curr = 1;

        int i=1,j=0;


        while(i<n && j<n){

            if(arr[i]<=dep[j]){
                curr++;
                i++;

            }else{
                curr--;
                j++;
            }

            max = Math.max(max,curr);


        }


        return max;

    }
}
