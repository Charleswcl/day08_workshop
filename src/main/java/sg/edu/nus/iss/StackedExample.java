package sg.edu.nus.iss;

import java.util.Iterator;
import java.util.Stack;

public class StackedExample {

    public void example() {
        Stack<Integer> stack = new Stack<Integer>();

        // pushing or putting something into on the stack
        for (int i = 1; i < 10; i++) {
            stack.push(i);
        }

        // pop or taking something from the stack
        for (int i = 1; i < 5; i++) {
            Integer stackItem = stack.pop();
            System.out.println("Stack Item (pop): " + stackItem);
        }

        // see what is the last item on the top of the stack
        Integer item = stack.peek();
        System.out.println("Item on top of the stack: " + item);

        Integer firstItem = stack.firstElement();
        System.out.println("First element of stack: " + firstItem);

        // search for an item in the stack and return the index where its found on the
        // stack
        Integer idexElement = stack.search(2);
        System.out.println("Stack element found at index: " + idexElement);

        Iterator<Integer> its = stack.iterator();
        while (its.hasNext()) {
            Integer stackIt = its.next();
            System.out.println("Iterator stack item: " + stackIt);
        }
    }
}
