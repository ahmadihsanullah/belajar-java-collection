package programmer.zaman.now;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Belajar Java Dasar");
        stack.push("Belajar Java OOP");

        try {
            for(var value = stack.pop(); value != null; value = stack.pop()){
                System.out.println(value);
            }
        }catch (EmptyStackException e){
            System.out.println(e.getMessage());
        }


    }
}
