import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CollectionsExercise {

  void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {

    numbers.add(i);

  }

  void addToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
    //numbers.add(0, i);
    numbers.addFirst(i);
  }

  void removeItemFromTopOfStack(Deque<Integer> stack) {
    //stack.pop();
    stack.poll();
  }

  void removeItemFromFrontOfQueue(Queue<Integer> queue) {
      //queue.poll();
        queue.remove();
  }

  void addItemToTreeSet(Set<String> set, String item) {
        set.add(item);
  }

}
