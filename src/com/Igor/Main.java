package com.Igor;

import java.util.*;
class Solution{

    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        boolean balanced=true;
        char last;
        while (sc.hasNext()) {
            String input=sc.next();
            LinkedList<Character> list = new LinkedList<Character>();
            balanced=true;

            for (char i : input.toCharArray()){
                if(i == '[' || i == '(' || i == '{'){
                    list.addLast(i);
                } else {
                    try {
                        last = list.getLast();
                        if ((i == ']' && last == '[') || (i == ')' && last == '(') || (i == '}' && last == '{'))
                            list.removeLast();
                        else
                            list.addLast(i);
                    }
                    catch (Exception e){
                        balanced = false;
                    }
                }
            }
            if(list.size()!=0) {
                balanced = false;
            }
            System.out.println(balanced);

        }
        sc.close();

    }
}
