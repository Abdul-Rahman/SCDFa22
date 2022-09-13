
public class GenDemo {

	// Demonstrate the generic class.
	public static void main(String args[]) {
		//Create a Gen reference for Integers.
	     Gen<Integer> iOb;
	     //Create a Gen<Integer> object and assign its
	     //reference to iOb. Notice the use of autoboxing
	     //to encapsulate the value 88 within an Integer object.
	     iOb = new Gen<Integer>(88);
	     
	     //Show the type of data used by iOb.
	     iOb.showType();
	
	     //Get the value in iOb. Notice that
	     //no cast is needed.
	     int v = iOb.getob();
	     System.out.println("value: " + v);
	     System.out.println();
	
	     // Create a Gen object for Strings.
	     Gen<String> strOb = new Gen<String> ("Generics Test");
	     
	     //Show the type of data used by strOb.
	     strOb.showType();
	     
	     //Get the value of strOb. Again, notice that no cast is needed.
	     String str = strOb.getob(); System.out.println("value: " + str);
	     
	     
	     
	   //Generics Work Only with Reference Types:
	     //When declaring an instance of a generic type, the type argument passed 
	     //to the type parameter must be a reference type. You cannot use a primitive 
	     // type, such as int or char. For example, with Gen, it is possible to pass 
	     //any class type to T, but you cannot pass a primitive type to a type 
	     //parameter. Therefore, the following declaration is illegal:
	     
	     //Gen<int> intOb = new Gen<int>(53);
	     // Error, can't use primitive type
	     
	     //Generic Types Differ Based on Their Type Arguments:
	     //A key point to understand about generic types is that a reference of one 
	     //specific version of a generic type is not type compatible with another 
	     //version of the same generic type. For example, assuming the program just 
	     //shown, the following line of code is in error and will not compile:
	     //iOb = strOb; // Wrong!
	     
     }
}
