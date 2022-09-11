package w01ex09;

//public class Test extends Parent1 {
public class Test extends Parent1, Parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating object of class in main() method
	    Test t = new Test();
	 
	    // Trying to call above functions of class where
	    // Error is thrown as this class is inheriting
	    // multiple classes
	    t.fun();
	}

}
