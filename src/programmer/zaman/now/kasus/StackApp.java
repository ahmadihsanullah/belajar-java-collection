package programmer.zaman.now.kasus;

import java.util.ArrayList;
import java.util.List;

public class StackApp<T> {
    private List<T> elements;

    public StackApp() {
        elements = new ArrayList<>();
    }

    public void push(T item) {
        elements.add(item);
    }

    public T pop() {
        if (!isEmpty()) {
            return elements.remove(elements.size() - 1);
        }
        return null;
    }

    public T peek() {
        if (!isEmpty()) {
            return elements.get(elements.size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public static void main(String[] args) {
        StackApp<Integer> intStack = new StackApp<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(55);

        System.out.println("Size of stack: " + intStack.size());
        System.out.println("Top element: " + intStack.peek());

        while (!intStack.isEmpty()) {
            System.out.println("Popped: " + intStack.pop());
        }
    }
}
