package generics_ex04;

/*
To handle such situations, Java provides bounded types. When specifying a type 
parameter, you can create an upper bound that declares the superclass from which 
all type arguments must be derived. This is accomplished through the use of an 
extends clause when specifying the type parameter, as shown here:
<T extends superclass>

This specifies that T can only be replaced by superclass, or subclasses of 
superclass. Thus, superclass defines an inclusive, upper limit.

You can use an upper bound to fix the Stats02 class shown earlier by specifying 
Number as an upper bound, as shown here:

//In this version of Stats, the type argument for T must be either Number, or a class derived from Number.

*/

public class Stats02<T extends Number> {
	  T[] nums; // array of Number or subclass
	  //Pass the constructor a reference to an array of type Number or subclass.
	  Stats02(T[] o) {
		  nums = o;
	}
	  
	//Return type double in all cases.
	double average() {
		double sum = 0.0;
		for(int i=0; i < nums.length; i++)
		sum += nums[i].doubleValue();
		return sum / nums.length;
	}
}