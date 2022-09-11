package w01ex08;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolarSystem s = new SolarSystem();
        Earth e = new Earth();
        Mars m = new Mars();
        Moon mo = new Moon();
  
        System.out.println(s instanceof SolarSystem);
        System.out.println(e instanceof SolarSystem);
        System.out.println(m instanceof SolarSystem);
        System.out.println(mo instanceof SolarSystem);
        
        System.out.println("-------------------------");
        System.out.println(s instanceof Earth);
        System.out.println(e instanceof Earth);
        //System.out.println(m instanceof Earth);
        // Exception : Incompatible conditional operand types Mars and Earth
        System.out.println(mo instanceof Earth);
        
	}

}
