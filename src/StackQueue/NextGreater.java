package StackQueue;

import java.util.*;
public class NextGreater {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> A) {

        Stack<Integer> stack = new Stack<>();

        int n = A.size();

        int[] ans = new int[n];


        for(int i = n-1;i>=0;i--){

            int x = A.get(i);

            if(stack.isEmpty())
                ans[i] = -1;
            else if(!stack.isEmpty() && A.get(stack.peek())>x)
                ans[i] = A.get(stack.peek());
            else if(!stack.isEmpty() && A.get(stack.peek())<=x){

                while(!stack.isEmpty() && A.get(stack.peek())<=x)
                    stack.pop();

                if(stack.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = A.get(stack.peek());

            }

            stack.push(i);


        }
        ArrayList<Integer> c = new ArrayList<>();

        for(int d:ans)
            c.add(d);

        return c;
    }
}
