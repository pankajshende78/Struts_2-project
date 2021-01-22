package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import p2.newcandidate;
import p2.savedata;




public class saveduo {

	public static Connection getconnection()
	{
	   Connection con=null;
	   try
	   {
		   Class.forName("com.mysql.cj.jdbc.Driver");
		    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/toall","root","root");
	   }
	   catch(Exception ee)
	   {
		   ee.printStackTrace();
	   }
		
		return con;
		
	}
	
	public String save(loginduo d)
	{  
		Connection con=saveduo.getconnection();
		
		try
		{
			PreparedStatement pst=con.prepareStatement("insert into register(username,password) values(?,?)");
			pst.setString(1, d.getUsername());
			pst.setString(2, d.getPassword());
			//pst.setString(3, d.getRepassword());
			int status=pst.executeUpdate();
			if(status>0)
			{
				return "success";
			}
			else
			{
				return "error";
			}
		}
		catch(Exception ee)
		{
			ee.getStackTrace();
		}
		return "error";
		
	}
	
	public String check(loginduo d)
	{
		Connection con=saveduo.getconnection();
		
		    try
	        {
				PreparedStatement pst=con.prepareStatement("select* from register where username=? and password=?");
		    	pst.setString(1, d.getUsername());
		    	pst.setString(2, d.getPassword());
		    	ResultSet rs=pst.executeQuery();
		    	if(rs.next())
		    	{
		    		return "user";
		    	}
		    	else
		    	{
				    return "error";
		    	}
		    }
		    catch(Exception ee)
		    {
		    	ee.printStackTrace();
		    }
		

		
		
		return "error";
	}
	
	public static List< newcandidate> view(){
		List< newcandidate> list=new ArrayList< newcandidate>();
		try{
			Connection con =savedata.getconnection();
			PreparedStatement ps=con.prepareStatement("select count(vote),vote from voteresult group by vote");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				 newcandidate bean=new  newcandidate();
				
				 bean.setVote(rs.getString(1));
				
				list.add(bean);
			}
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return list;
	}
	
	
	
	

}
