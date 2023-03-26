/*
Mike Dowell's Siegni
3086994
25/03/2023
 */
import java.util.Iterator;

interface Stack<E> {
    public boolean push(E x); //function to add an element to the top of the stack
    public boolean pop(); //function to remove an element from the top of the stack
    public E top(); // function to return the top element of the stack
    public boolean empty(); //function to check if the stack is empty
    public boolean full(); //function to check if the stack is full
    public Iterator<E> iterator(); //function to return an iterator of the stack

}
