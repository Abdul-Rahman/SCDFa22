package generics_ex04;
//Bounded Types
/*
In the preceding examples, the type parameters could be replaced by any class type.
This is fine for many purposes, but sometimes it is useful to limit the types that 
can be passed to a type parameter. For example, assume that you want to create a 
generic class that contains a method that returns the average of an array of numbers.
Furthermore, you want to use the class to obtain the average of an array of any type
of number, including integers, floats, and doubles. Thus, you want to specify the 
type of the numbers generically, using a type parameter. To create such a class, 
you might try something like this:
 */


//Stats01 attempts (unsuccessfully) to create a generic class that can compute the 
// average of an array of numbers of any given type. The class contains an error!

public class Stats01 <T> {
	T[] nums; // nums is an array of type T
    //Pass the constructor a reference toan array of type T.
	Stats01(T[] o) { 
		nums = o;
	}
	
	// Return type double in all cases.
	double average() {
		double sum = 0.0;
		for(int i=0; i < nums.length; i++)
		sum += nums[i].doubleValue(); 
		// Error!!!
		//The method doubleValue() is undefined for the type T
		
			/*
		Because all numeric classes, such as Integer and Double, are subclasses of 
		Number, and Number defines the doubleValue( ) method, this method is available 
		to all numeric wrapper classes. The trouble is that the compiler has no way to 
		know that you are intending to create Stats objects using only numeric types. 
		Thus, when you try to compile Stats, an error is reported that indicates that 
		the doubleValue( ) method is unknown. 
		 */
		return sum / nums.length;
	}
	
}
