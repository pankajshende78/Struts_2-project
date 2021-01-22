package p2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import p1.loginduo;
import p1.saveduo;



public class savedata {
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
	
	public String save(newcandidate d)
	{  
		Connection con=savedata.getconnection();
		
		try
		{
			PreparedStatement pst=con.prepareStatement("insert into newcandidate values(?,?,?,?,?,?)");
			pst.setString(1, d.getId());
			pst.setString(2, d.getEid());
			pst.setString(3, d.getTopic());
			pst.setString(4, d.getName());
			pst.setString(5, d.getAddress());
			pst.setString(6, d.getMobile());
			
			int status=pst.executeUpdate();
			con.close();
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
	
	public String savevote(newcandidate d)
	{  
		Connection con=savedata.getconnection();
		
		try
		{
			PreparedStatement pst=con.prepareStatement("insert into voters values(?,?)");
			pst.setString(1, d.getVoteid());
		    pst.setString(2, d.getName());
			
			
			int status=pst.executeUpdate();
			con.close();
			
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
	
	
	public static List< newcandidate> view(){
		List< newcandidate> list=new ArrayList< newcandidate>();
		try{
			Connection con =savedata.getconnection();
			PreparedStatement ps=con.prepareStatement("select * from voters");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				 newcandidate bean=new  newcandidate();
				
				 
				 bean.setVoteid(rs.getString("voteid"));
				 bean.setName(rs.getString("name"));
				
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
	
	
	public String check(newcandidate d)
	{
		Connection con=savedata.getconnection();
		
		    try
	        {
				PreparedStatement pst=con.prepareStatement("select* from voters where voteid=?");
		    	pst.setString(1, d.getVoteid());
		    	
		    	ResultSet rs=pst.executeQuery();
		    	if(rs.next())
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
		    	ee.printStackTrace();
		    }
		

		
		
		return "error";
	}
	
	
	public String storevote(newcandidate d)
	{  
		Connection con=savedata.getconnection();
		
		try
		{
			PreparedStatement pst=con.prepareStatement("insert into voteresult values(?)");
			pst.setString(1, d.getVote());
		    
			
			
			int status=pst.executeUpdate();
			con.close();
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
	
	
	public static List< newcandidate> show(){
		List< newcandidate> list=new ArrayList< newcandidate>();
		try{
			Connection con =savedata.getconnection();
			PreparedStatement ps=con.prepareStatement("select * from voters");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				newcandidate bean=new newcandidate();
				
				bean.setId(rs.getString("id"));
				bean.setEid(rs.getString("eid"));
				bean.setTopic(rs.getString("topic"));
				bean.setName(rs.getString("name"));
				bean.setAddress(rs.getString("address"));
				bean.setMobile(rs.getString("mobile"));
				
				
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
