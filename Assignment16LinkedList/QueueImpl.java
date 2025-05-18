import java.util.*;
public class QueueImpl
{
	public static void main(String[] args) {
	/*  4. **Queue Behavior with LinkedList**:
   Create a Java program that uses a `LinkedList` to simulate a queue. Add the names {"Alice", "Bob", "Charlie", "Diana"} to the queue.
   Remove two names from the front of the queue, then print the names that remain in the queue.*/
        Queue<String> q = new LinkedList<>();
        q.offer("Alice");
        q.offer("Bob");
        q.offer("Charlie");
        q.offer("Diana");
        q.poll();
        q.poll();
        
        System.out.println(q);
        
    
	}
}
