package BinarySearch;

import java.util.*;
public class SearchRange {
    static int start,end;

    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {

        start = -1;
        end =-1;

        ArrayList<Integer> ans = new ArrayList<>();

        solveFirst(A,B,0,A.size()-1);
        solveLast(A,B,0,A.size()-1);


        ans.add(start);
        ans.add(end);

        return ans;
    }
    private static void solveFirst(final List<Integer> A,int target,int left,int right){

        if(right<left)
            return;


        int mid = left + (right-left)/2;

        if(A.get(mid)==target){
            start = mid;
            solveFirst(A,target,left,mid-1);
        }

        if(A.get(mid)>=target)
            solveFirst(A,target,left,mid-1);
        else
            solveFirst(A,target,mid+1,right);




    }


    private static void solveLast(final List<Integer> A,int target,int left,int right){

        if(right<left)
            return;


        int mid = left + (right-left)/2;

        if(A.get(mid)==target){
            end = mid;
            solveLast(A,target,mid+1,right);
        }




        if(A.get(mid)>target)
            solveLast(A,target,left,mid-1);
        else
            solveLast(A,target,mid+1,right);


    }





}
