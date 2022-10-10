package alphapeeler;

import java.io.*;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet{
	public void doGet (HttpServletRequest req, HttpServletResponse res) {
		try {
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			String name = req.getParameter("userName");
			String pass = req.getParameter("userPassword");
			pw.print("Hello "+ name);
			pw.print("Your Password is "+ pass);
			
			Cookie c1 = new Cookie("userName", name);
			Cookie c2 = new Cookie("userPassword", pass);
			res.addCookie(c1);
			res.addCookie(c2);
			pw.print("<BR><a href='welcomehere' > View Details </a>");
		} catch (Exception exp) {
			System.out.println(exp);
		}
	}

}
