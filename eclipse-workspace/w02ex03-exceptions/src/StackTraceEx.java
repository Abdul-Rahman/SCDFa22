//program to print the exception information using printStackTrace() method

public class StackTraceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
	      int b=0;
	        try{
	          System.out.println(a/b);
	        }
	      catch(ArithmeticException e){
	        e.printStackTrace();
	      }
	    }
	}


