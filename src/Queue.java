/*
Mike Dowell's Siegni
3086994
25/03/2023
 */
import java.util.Iterator;

public interface Queue<T> {
    public boolean enqueue(T x);//add an element to the end of the queue
    public T top();//return the top element of the queue
    public boolean dequeue();//remove the top element of the queue
    public boolean empty();//check if the queue is empty
    public String toString();//return a string representation of the queue
    public boolean contains(T x);//check if the queue contains the element
    public Iterator<T> iterator();//this will be used in toString()

}
