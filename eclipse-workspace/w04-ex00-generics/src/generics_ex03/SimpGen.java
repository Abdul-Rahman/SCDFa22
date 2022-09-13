package generics_ex03;

//A Generic Class with Two Type Parameters
public class SimpGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
		
		//Show the types.
	    tgObj.showTypes();
	    //Obtain and show values.
	    int v = tgObj.getob1();
	    System.out.println("value: " + v);
	    String str = tgObj.getob2(); System.out.println("value: " + str);	 
	}
}
