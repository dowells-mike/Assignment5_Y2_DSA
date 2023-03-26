/*
Mike Dowell's Siegni
3086994
25/03/2023
 */
import java.util.Arrays;
import java.util.Iterator;

public class StackArray<E> implements Stack<E> {

    private E[] data; // array of elements
    private int top;

    public StackArray(int capacity) {
        data = (E[]) new Object[capacity]; //create array with capacity
        top = -1;
    }

    @Override
    public boolean push(E x) {
        if (full()) {
            return false;
        }
        data[++top] = x; // increment top and push x
        return true;
    }

    @Override
    public boolean pop() {
        if (empty()) {
            return false;
        }
        data[top--] = null; // decrement top and pop x
        return true;
    }

    @Override
    public E top() {
        return data[top];
    }

    @Override
    public boolean empty() {
        return top == -1;
    }

    @Override
    public boolean full() {
        return top == data.length - 1;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();//the iterator method is not supported for arrays
    }
}