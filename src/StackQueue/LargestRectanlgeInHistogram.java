package StackQueue;

import java.util.*;
public class LargestRectanlgeInHistogram {


    public int largestRectangleArea(ArrayList<Integer> list) {

        int[] left = left(list);
        int[] right = right(list);

        int ans = 0;

        for(int i=0;i<list.size();i++){

            ans = Math.max(ans,(right[i]-left[i]-1)*list.get(i));

        }


        return ans;



    }
    private static int[] left(ArrayList<Integer> list){

        int[] ans = new int[list.size()];

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<list.size();i++){

            if(stack.isEmpty())
                ans[i] = -1;
            else if(!stack.isEmpty() && list.get(stack.peek())<list.get(i))
                ans[i] = stack.peek();

            else if(!stack.isEmpty() && list.get(stack.peek())>=list.get(i)){
                while(!stack.isEmpty() && list.get(stack.peek())>=list.get(i))
                    stack.pop();
                if(stack.isEmpty())
                    ans[i] = -1;
                else
                    ans[i] = stack.peek();

            }

            stack.push(i);
        }



        return ans;

    }
    private static int[] right(ArrayList<Integer> list){

        int[] ans = new int[list.size()];

        Stack<Integer> stack = new Stack<>();

        for(int i=list.size()-1;i>=0;i--){

            if(stack.isEmpty())
                ans[i] = list.size();
            else if(!stack.isEmpty() && list.get(stack.peek())<list.get(i))
                ans[i] = stack.peek();
            else if(!stack.isEmpty() && list.get(stack.peek())>=list.get(i)){
                while(!stack.isEmpty() && list.get(stack.peek())>=list.get(i))
                    stack.pop();

                if(stack.isEmpty())
                    ans[i] = list.size();
                else
                    ans[i] = stack.peek();
            }

            stack.push(i);


        }

        return ans;

    }


}
