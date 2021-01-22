package p2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class candidatedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		List<newcandidate> list=savedata.show();
        out.print("<h1>Candidate Data</h1>");
		
		out.println("<table border='1' style='border-collapse: collapse;'>");
		out.println("<tr><th>ID</th><th>Eid</th><th>Topic</th><th>Name</th><th>Address</th><th>Address</th><th>Mobile</th></tr>");
		for(newcandidate bean:list){
			out.println("<tr><td>"+bean.getId()+"</td><td>"+bean.getEid()+"</td><td>"+bean.getTopic()+"</td><td>"+bean.getName()+"</td><td>"+bean.getAddress()+"</td><td>"+bean.getMobile()+"</td></tr>");
			
			
			
		}
		out.println("</table>");
		
		out.println("</div>");
		out.print("<br> <a  href='user.jsp'>Back</a>");
		
		out.close();
		
		
	}

	
	
}
