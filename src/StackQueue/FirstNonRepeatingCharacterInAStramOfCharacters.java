package StackQueue;

import java.util.*;
public class FirstNonRepeatingCharacterInAStramOfCharacters {
    public String solve(String A) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        Deque<Character> deque = new LinkedList<>();
        String str = "";

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {

            char c = A.charAt(i);

            if (hashMap.containsKey(c))
                hashMap.put(c, hashMap.get(c) + 1);
            else {
                hashMap.put(c, 1);
                deque.add(c);
            }

            while (!deque.isEmpty() && hashMap.get(deque.peekFirst()) >= 1) {
                if (hashMap.get(deque.peekFirst()) == 1) {
                    s.append(deque.peekFirst());
                    break;
                } else {
                    deque.removeFirst();
                }
            }
            if (deque.isEmpty())
                s.append("#");

        }


        return String.valueOf(s);


    }
}
