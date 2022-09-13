// Java program to Illustrate Working of TreeSet

/*
TreeSet is one of the most important implementations of the SortedSet interface in 
Java that uses a Tree for storage. The ordering of the elements is maintained by a 
set using their natural ordering whether or not an explicit comparator is provided.
*/




import java.util.*;

// Main class
class TreeSet01 {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating a Set interface with reference to
		// TreeSet
		Set<String> ts1 = new TreeSet<>();

		// Elements are added using add() method
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");

		// Duplicates will not get insert
		ts1.add("C");

		// Elements get stored in default natural
		// Sorting Order(Ascending)
		System.out.println(ts1);
	}
}



// output: [A, B, C]