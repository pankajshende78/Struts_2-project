package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import p2.newcandidate;
import p2.savedata;


public class result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		List<newcandidate> list=saveduo.view();
        out.print("<h1>Voting Result</h1>");
		
		out.println("<table border='1' style='border-collapse: collapse;'>");
		out.println("<tr><th>Conut</th><th>Candidate</th>");
		for(newcandidate bean:list){
			out.println("<tr><td>"+bean.getVote()+"</td><td>"+bean.getName()+"</td></tr>");
			
			
			
		}
		out.println("</table>");
		
		out.println("</div>");
		out.print("<br> <a  href='admin.jsp'>Back</a>");
		
		out.close();
		
		
		
	}

	
}
