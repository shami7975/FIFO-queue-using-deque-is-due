package fifoqueue;

import java.util.Deque;
import java.util.LinkedList;

public class FIFOQueue {
    private Deque<Integer> queue;

    public FIFOQueue() {
        queue = new LinkedList<>();
    }

    // Add element to the queue
    public void enqueue(int item) {
        queue.addLast(item); // add to the end
        System.out.println(item + " enqueued to queue");
    }

    // Remove element from the queue
    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = queue.removeFirst(); // remove from the front
        System.out.println(removed + " dequeued from queue");
        return removed;
    }

    // Peek the front element
    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue.peekFirst();
    }

    // Display queue
    public void display() {
        System.out.println("Queue: " + queue);
    }

    public static void main(String[] args) {
        FIFOQueue myQueue = new FIFOQueue();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        myQueue.display();

        System.out.println("Front element is: " + myQueue.peek());

        myQueue.dequeue();
        myQueue.display();
    }
}
