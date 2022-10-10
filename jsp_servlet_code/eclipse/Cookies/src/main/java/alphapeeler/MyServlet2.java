package alphapeeler;

import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet{
	public void doGet (HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			
			//Reading cookies
			Cookie[] c = req.getCookies();
			pw.print("Name here : "+ c[0]);
			pw.print("Password : "+ c[1]);
			pw.close();

		} catch (Exception exp) {
			System.out.println(exp);
		}
	}

}
