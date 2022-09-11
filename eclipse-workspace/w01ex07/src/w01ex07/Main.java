package w01ex07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
        d.printChildB();
        d.printChildC();
        d.printD();
        
        System.out.println("-------------------");
        B b = new B();
        b.printParentA();
        b.printChildB();
        
        System.out.println("-------------------");
        C c = new C();
        c.printParentA();
        c.printChildC();
        
	}

}
