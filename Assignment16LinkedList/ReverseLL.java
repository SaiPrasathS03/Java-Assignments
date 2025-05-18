import java.util.*;
public class ReverseLL
{
	public static void main(String[] args) {
	/*5. **Reverse LinkedList**:
   Write a Java program that creates a `LinkedList` of characters with the values {'A', 'B', 'C', 'D', 'E'}.
   Write a method to reverse the linked list and print the reversed list.*/
        
        List<Character>ll = new LinkedList<>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('D');
        ll.add('E');
        reverseLL(ll);
        System.out.println(ll);
	}
	public static void reverseLL(List<Character> ll){
	    int l=0,r=ll.size()-1;
	    while(l<r){
	        Character t = ll.get(l);
	        ll.set(l,ll.get(r));
	        ll.set(r,t);
	        l++;r--;
	    }
	    
	}
}
