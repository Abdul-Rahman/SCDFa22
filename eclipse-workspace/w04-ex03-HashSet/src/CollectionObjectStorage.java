// Java program to illustrate the concept
// of Collection objects storage in a HashSet
import java.io.*;
import java.util.*;
/*
The HashSet class implements the Set interface, backed by a hash table which is 
actually a HashMap instance. 
 */
class CollectionObjectStorage {
    public static void main(String[] args)
    {
        // Instantiate an object of HashSet
        HashSet<ArrayList> set = new HashSet<>();
  
        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();
  
        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();
  
        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set.add(list1);
        set.add(list2);
  
        // print the set size to understand the
        // internal storage of ArrayList in Set
        System.out.println(set.size());
        
        
    }
}


//output: 1
/*
 * Before storing an Object, HashSet checks whether there is an existing 
 * entry using hashCode() and equals() methods. In the above example, two 
 * lists are considered equal if they have the same elements in the same 
 * order. When you invoke the hashCode()  method on the two lists, they 
 * both would give the same hash since they are equal. 
 */
//HashSet does not store duplicate items,  if you give two Objects that are 
// equal then it stores only the first one, here it is list1.