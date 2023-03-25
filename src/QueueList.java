/*
Mike Dowell's Siegni
3086994
25/03/2023
 */
import java.util.Iterator;
import java.util.LinkedList;

public class QueueList<E> implements Queue<E> {

    private LinkedList<E> data;

    public QueueList() {
        data = new LinkedList<>();
    }

    @Override
    public boolean enqueue(E x) {
        return data.offer(x);
    }

    @Override
    public E top() {
        return data.peek();
    }

    @Override
    public boolean dequeue() {
        return data.poll() != null;
    }

    @Override
    public boolean empty() {
        return data.isEmpty();
    }

    @Override
    public String toString() {
        return data.toString();
    }

    @Override
    public boolean contains(E x) {
        return data.contains(x);
    }

    @Override
    public Iterator<E> iterator() {
        return data.iterator();
    }
}