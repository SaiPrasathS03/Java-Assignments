import java.util.*;
public class ReplaceWordInLL
{
	public static void main(String[] args) {
	   /*2. **Iterate and Modify Elements**:
   Create a Java program that initializes a `LinkedList` of strings with the values {"one", "two", "three", "four", "five"}. Use a `ListIterator` to 
   iterate through the list and replace every occurrence of the word "three" with "THREE". Print the modified list.*/
        LinkedList<String> ll = new LinkedList<>();
        
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        ll.add("five");
        
        ListIterator<String> li = ll.listIterator();
        while(li.hasNext()){
            String curr = li.next();
            if(curr.equals("three")){
                li.set("THREE");
            }
        }
        System.out.println(ll);
	}
}
