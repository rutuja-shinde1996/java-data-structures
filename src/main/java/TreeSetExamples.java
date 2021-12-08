import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//TreeSet adds elements in the sorted order.
public class TreeSetExamples {

  public static void main(String[] args) {
    Set<Integer> treeSet = new TreeSet<>();
    treeSet.add(1);
    treeSet.add(300);
    treeSet.add(47);
    treeSet.add(6);
    System.out.println(treeSet);

    //duplicates are not allowed.
    treeSet.add(6);
    System.out.println(treeSet);

    //alphabetical order
    //Set<String> wordSet = new TreeSet<>();

    //sort by length
    Set<String> wordSet = new TreeSet<>(Comparator.comparing(String::length));

    wordSet.add("tiger");
    wordSet.add("giraffe");
    wordSet.add("bear");
    System.out.println(wordSet);

    //bear and wolf are counting as duplicate becoz of the same length line no.24
    wordSet.add("wolf");
    System.out.println(wordSet);

    wordSet.remove("giraffe");
    System.out.println(wordSet);

  }

}
