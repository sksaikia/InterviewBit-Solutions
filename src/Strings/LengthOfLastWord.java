package Strings;

import java.util.*;
public class LengthOfLastWord {
    public int lengthOfLastWord(final String str) {

        Stack<Character> stack = new Stack<>();
        int last = 0;

        for (int i=0;i<str.length();i++){

            if (str.charAt(i)==' '){
                if (!stack.isEmpty())
                    last = stack.size();
                stack = new Stack<>();
            }
            else
                stack.push(str.charAt(i));

        }
        if (stack.size()>0)
            last = stack.size();


        return last;

    }
}

