import java.util.*;
public class AddAndAccessLL
{
	public static void main(String[] args) {
	    /*LinkedList:
1. **Add and Access Elements**:
   Write a Java program that creates a `LinkedList` of integers. Add the numbers 5, 10, 15, 20, and 25 to the list. Retrieve and print the first and last elements in the list.*/
        List<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(10);
        ll.add(15);
        ll.add(20);
        ll.add(25);
        
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        
	}
}
