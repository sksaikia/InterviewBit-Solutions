package StackQueue;
import java.util.*;
public class NearestSmallerElement {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> ar) {

        ArrayList<Integer> res = new ArrayList<>();


        Stack<Integer> stack = new Stack<>();

        for (int i=0;i<ar.size();i++){


            if (stack.isEmpty())
                res.add(-1);
            else if (!stack.isEmpty() && stack.peek()<ar.get(i))
                res.add(stack.peek());
            else if (!stack.isEmpty() && stack.peek()>=ar.get(i)){
                while (!stack.isEmpty() && stack.peek()>=ar.get(i)){
                    stack.pop();
                }

                if (stack.isEmpty())
                    res.add(-1);
                else
                    res.add(stack.peek());
            }

            stack.push(ar.get(i));

        }

        return res;

    }
}
