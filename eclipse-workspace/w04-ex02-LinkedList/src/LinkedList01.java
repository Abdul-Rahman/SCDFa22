// Java Program to Demonstrate Implementation of LinkedList class
import java.util.*;

public class LinkedList01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();
        // Adding elements to the linked list
        ll.add("A");					//[A]
        ll.add("B");					//[A, B]
        ll.addLast("C");				//[A, B, C]
        ll.addFirst("D");				//[D, A, B, C]
        ll.add(2, "E");					//[D, A, E, B, C]
        System.out.println(ll);			
        ll.remove("B");					//[D, A, E, C]
        ll.remove(3);					//[D, A, E]
        ll.removeFirst();				//[A, E]
        ll.removeLast();				//[A]
        System.out.println(ll);
        //Changing Elements
        ll.set(0, "K");					//[K]
        //ll.set(1, "M");  // IndexOutOfBoundsException because 1 does not exists
        ll.add(1, "L");					//[K, L]
        ll.set(1, "M");					//[K, M]
        System.out.println(ll);
        
        // Iterating the LinkedList Using the Get method and the for loop
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " , ");
        }
	}

}
