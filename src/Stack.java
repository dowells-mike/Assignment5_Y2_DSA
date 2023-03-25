/*
Mike Dowell's Siegni
3086994
25/03/2023
 */
import java.util.Iterator;

interface Stack<E> {
    public boolean push(E x);
    public boolean pop();
    public E top();
    public boolean empty();
    public boolean full();
    public Iterator<E> iterator();

}
