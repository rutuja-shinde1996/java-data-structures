import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExamples {

  public static void main(String[] args) {

    Queue<String> queue = new ArrayDeque<>();
    // offer adds elements to the queue
    queue.offer("Person One");
    queue.offer("Person Two");
    queue.offer("Person Three");
    System.out.println(queue);

    //peek prints the first element of the queue
    System.out.println(queue.peek());

    //poll removes the first element of the queue
    queue.poll();
    System.out.println(queue);
    
  }

}
