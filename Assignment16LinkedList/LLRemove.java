import java.util.*;
public class LLRemove
{
	public static void main(String[] args) {
	   /*3. **LinkedList Operations**:
   Write a Java program that creates a `LinkedList` of integers. Add the numbers 1 to 10 to the list. 
   Then, remove the third element (index 2) and the last element from the list. Print the resulting list.*/
        List<Integer> ll = new LinkedList<>();
        
        for(int i=1;i<=10;i++) ll.add(i);
        
        ListIterator it = ll.listIterator();
        int count=0;
        while(it.hasNext()){
            System.out.println(it.next());
            count++;
            if(count==2){
                ll.remove(it.next());
                break;
            }
            
        }
        ll.removeLast();
        System.out.println(ll);
	}
}
