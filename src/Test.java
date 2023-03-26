/*
Mike Dowell's Siegni
3086994
25/03/2023
 */
public class Test {
      public static void main(String[] args) {

          System.out.println("\n\n----Stack Testing----");
          StackArray<Integer> stack = new StackArray<>(5);
          stack.push(1);
          stack.push(2);
          stack.push(3);
          System.out.println(stack.top()); // Output: 3
          stack.pop();
          System.out.println(stack.top()); // Output: 2
          stack.pop();
          System.out.println(stack.top()); // Output: 1
          stack.pop();
          System.out.println(stack.empty()); // Output: true
          stack.pop();
          System.out.println(stack.pop()); // Output: false


          System.out.println("\n\n----Queue Testing----");
          QueueList<String> queue = new QueueList<>();
          queue.enqueue("a");
          queue.enqueue("b");
          queue.enqueue("c");
          System.out.println(queue); // Output: [a, b, c]
          System.out.println(queue.top()); // Output: a
          queue.dequeue();
          System.out.println(queue); // Output: [b, c]
          System.out.println(queue.contains("c")); // Output: true
          System.out.println(queue.contains("d")); // Output: false
          while (!queue.empty()) {//while the queue is not empty, print the current top element and remove it
              System.out.println(queue.top());
              queue.dequeue();
          }
          // Output:
          // b
          // c
     }
}
