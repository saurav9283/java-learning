import java.util.LinkedList;
import java.util.Queue;

public class QueueIterationExample{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(3);
        q.offer(4);
        q.offer(6);
        q.offer(2);

        Queue<Integer> copy_q = new LinkedList<>(q);
        while (!copy_q.isEmpty())
        {
            System.out.println(copy_q.poll());
        }
    }
}