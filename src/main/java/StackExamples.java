import java.util.ArrayDeque;
import java.util.Deque;

public class StackExamples {

  public static void main(String[] args) {
    
    Deque<String> stack = new ArrayDeque<>();
    stack.push("First request");
    stack.push("Second request");
    stack.push("Third request");
    System.out.println(stack);

    //peek prints first element
    System.out.println(stack.peek());

    //pop and poll are one and same.
    stack.pop();
    System.out.println(stack);
    stack.poll();
    System.out.println(stack);

  }

}
