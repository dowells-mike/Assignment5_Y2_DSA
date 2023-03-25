/*
Mike Dowell's Siegni
3086994
25/03/2023
 */
import java.util.Iterator;

public class StackArray<E> implements Stack<E> {

    private E[] data;
    private int top;

    public StackArray(int capacity) {
        data = (E[]) new Object[capacity];
        top = -1;
    }

    @Override
    public boolean push(E x) {
        if (full()) {
            return false;
        }
        data[++top] = x;
        return true;
    }

    @Override
    public boolean pop() {
        if (empty()) {
            return false;
        }
        data[top--] = null;
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
        throw new UnsupportedOperationException();
    }
}