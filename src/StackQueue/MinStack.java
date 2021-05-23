package StackQueue;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stackMain;
    Stack<Integer> minStack;

    public MinStack(){
        stackMain = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int x) {

        stackMain.push(x);

        if(minStack.isEmpty()){
            minStack.push(x);
            return ;

        }

        int y = minStack.peek();

        if(x<y)
            minStack.push(x);
        else
            minStack.push(y);


    }
    public void pop() {
        if(stackMain.isEmpty())
            return;

        minStack.pop();
        stackMain.pop();
    }

    public int top() {
        if(stackMain.isEmpty())
            return -1;
        return stackMain.peek();
    }

    public int getMin() {
        if(minStack.isEmpty())
            return -1;
        return minStack.peek();
    }
}
