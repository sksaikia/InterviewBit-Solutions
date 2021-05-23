package BinarySearch;

import java.util.*;
public class RotatedSortedArraySearch {
    public int search(final List<Integer> A, int B) {

        int pivot = binarySearch(A,0,A.size()-1);
        if(pivot==-1)
            return search(A,0,A.size()-1,B);

        if(A.get(pivot)==B)
            return pivot;

        if(A.get(0)<=B)
            return search(A,0,pivot-1,B);
        return search(A,pivot+1,A.size()-1,B)  ;



    }

    public static int search(final List<Integer> A,int left,int right,int k){

        if(right<left)
            return -1;

        int mid = left + (right-left)/2;


        if(A.get(mid)==k)
            return mid;
        if(A.get(mid)>k)
            return search(A,left,mid-1,k);
        return search(A,mid+1,right,k);


    }



    public static int binarySearch(final List<Integer> A,int left,int right){

        if(right<left)
            return -1;

        if(left==right)
            return left;

        int mid = left + (right-left)/2;

        if(mid<right && A.get(mid+1)<A.get(mid))
            return mid;

        if(mid>left && A.get(mid)<A.get(mid-1))
            return mid-1;

        if(A.get(left)<A.get(mid))
            return binarySearch(A,mid+1,right);
        else
            return binarySearch(A,left,mid-1);

    }

}
