import java.util.LinkedList;
import java.util.Queue;

class easy5 {
    Queue<Integer> queue = new LinkedList<>();

    public int ping(int time) {
        queue.offer(time);

        while (queue.peek() < time - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}