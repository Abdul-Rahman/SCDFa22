package alphapeeler;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Generic1 extends GenericServlet {

	public void service (ServletRequest req, ServletResponse res) throws IOException, ServletException{
		res.setContentType("text/html");
		PrintWriter pwriter = res.getWriter();
		pwriter.print("<html>");
		pwriter.print("<body>");
		pwriter.print("<H2>GenericServlet Example</H2>");
		pwriter.print("<P>Welcome to AlphaPeeler</P>");
		pwriter.print("<body>");
		pwriter.print("</html>");
	}
}
