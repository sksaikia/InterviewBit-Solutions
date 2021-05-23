package BinarySearch;

import java.util.*;
public class MatrixSearch {
    public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {

        int m = A.size();
        int n = A.get(0).size();

        return solve(A,B,m-1,n-1);

    }

    private static int solve(ArrayList<ArrayList<Integer>> A,int key,int row,int col){

        if(row<0 || col<0)
            return 0;

        if(A.get(row).get(col)==key)
            return 1;

        int x = A.get(row).get(col);

        if(x>key || col==0)
            return solve(A,key,row,col-1);
        else if(x<key || row==0)
            return solve(A,key,row-1,col);
        else
            return 0;

    }
}
