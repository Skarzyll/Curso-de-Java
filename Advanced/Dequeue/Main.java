import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deq = new ArrayDeque<>();

        deq.addLast(-1);
        deq.addFirst(1);
        deq.add(2);

        deq.forEach((ele) -> System.out.println(ele));
        
    }
}
