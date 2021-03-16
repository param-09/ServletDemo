package com.param;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet COnfig & Servlet Context Demo
 *
 * */
public class MyServlet extends HttpServlet

{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException 
	{
		PrintWriter out=res.getWriter();
		out.println("Hello"+"\n");

	/*	ServletContext ctx=getServletContext();   //Servlet Context
		String str=ctx.getInitParameter("laptop");
		out.println(str);
		*/

		ServletConfig cfg=getServletConfig();			//Servlet Config
		String str=cfg.getInitParameter("naam");
		out.println(str);
	
	}
}
