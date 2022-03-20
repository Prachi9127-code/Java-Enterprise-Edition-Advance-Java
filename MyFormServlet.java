package com.my;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyFormServlet")
public class MyFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyFormServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		pw.println("<html><body bgcolor='pink'>");
		pw.println("<form action=\"MyFormServlet\"  method=\"post\">");
		pw.println("Enter First Number<input type=\"text\" name=\"no1\"><br>");
		pw.println("Enter Second Number<input type=\"text\" name=\"no2\"><br>");
		pw.println("<input type=\"submit\" value=\"add\" name='btn'>");
		pw.println("<input type=\"submit\" value=\"sub\" name='btns'>");
		pw.println("<input type=\"submit\" value=\"mul\" name='btnm'>");
		pw.println("<input type=\"submit\" value=\"div\" name='btnd'>");
		pw.println("</form></body></html>");
		
		if(request.getParameter("btn")!=null) {
			pw.println("sum is"+(Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"))));
		}
		if(request.getParameter("btns")!=null) {
			pw.println("subtract is"+(Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"))));
		}
		if(request.getParameter("btnm")!=null) {
			pw.println("multiplication is"+(Integer.parseInt(request.getParameter("no1"))*Integer.parseInt(request.getParameter("no2"))));
		}
		if(request.getParameter("btnd")!=null) {
			pw.println("division is"+(Integer.parseInt(request.getParameter("no1"))/Integer.parseInt(request.getParameter("no2"))));
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
