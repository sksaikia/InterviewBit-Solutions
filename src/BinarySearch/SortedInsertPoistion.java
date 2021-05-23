package BinarySearch;

import java.util.*;
public class SortedInsertPoistion {
    static int cand = 0 ;
    public int searchInsert(ArrayList<Integer> a, int b) {

        cand = 0;
        if(a.get(a.size()-1)<b)
            return a.size();
        solve(a,b,0,a.size()-1);
        return cand;
    }

    private static void solve(ArrayList<Integer> A,int target,int left,int right){

        if(right<left){
            return ;
        }

        int mid = left + (right-left)/2;

        if(A.get(mid)==target){
            cand = mid;
            return ;
        }


        if(A.get(mid)>target){
            cand = mid;
            solve(A,target,left,mid-1);
        }else{
            solve(A,target,mid+1,right);
        }


    }

}
