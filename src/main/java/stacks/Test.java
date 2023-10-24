package stacks;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        // stack = LIFO data structure = last in first out
        // dernier entré, premier sortie
        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("FFVII");

        //   stack.pop();      //remove last
        System.out.println(stack.peek());     //print the last in else return -1
       /* String Sta = stack.pop();
        System.out.println(Sta);*/

        /*for (int i = 0; i < 100000; i++) {
            stack.push("othmane");
       }*/

        System.out.println(stack);


    }
}
