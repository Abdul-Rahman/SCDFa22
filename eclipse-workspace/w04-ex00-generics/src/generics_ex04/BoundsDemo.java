package generics_ex04;

public class BoundsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer inums[] = { 1, 2, 3, 4, 5 };
		Stats02 <Integer> iob = new Stats02<Integer>(inums);
		double v = iob.average();
		System.out.println("iob average is " + v);
		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats02 <Double> dob = new Stats02<Double>(dnums);
		double w = dob.average();
		System.out.println("dob average is " + w);
		
		//This won't compile because String is not a subclass of Number.
		//String strs[] = { "1", "2", "3", "4", "5" };
		//Stats02 <String> strob = new Stats02<String>(strs);
		//double x = strob.average();
		System.out.println("strob average is " + v);
	}
}
