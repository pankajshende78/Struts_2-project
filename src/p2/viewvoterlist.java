package p2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class viewvoterlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		List<newcandidate > list=savedata.view();
        out.print("<h1>Voter List</h1>");
		
		out.println("<table border='1' style='border-collapse: collapse;'>");
		out.println("<tr><th>Voter ID</th><th>Name</th></tr>");
		for(newcandidate bean:list){
			out.println("<tr><td>"+bean.getVoteid()+"</td><td>"+bean.getName()+"</td></tr>");
			
			
			
		}
		out.println("</table>");
		
		out.println("</div>");
		out.print("<br> <a  href='user.jsp'>Back</a>");
		
		out.close();
		
		
	}

	
}
