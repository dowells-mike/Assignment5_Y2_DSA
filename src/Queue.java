/*
Mike Dowell's Siegni
3086994
25/03/2023
 */
import java.util.Iterator;

public interface Queue<T> {
    public boolean enqueue(T x);
    public T top();
    public boolean dequeue();
    public boolean empty();
    public String toString();
    public boolean contains(T x);
    public Iterator<T> iterator();

}
