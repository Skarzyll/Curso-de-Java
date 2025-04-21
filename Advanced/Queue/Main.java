package Advanced.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();

        q.add(1);
        q.add(2);
        q.add(3);

        int ele1 = q.poll();
        int eled = q.poll();

        System.out.println(ele1);
        System.out.println(eled);
        System.out.println(q.size());
    }
}
