package p1;

public class loginduo {
	
	private String username,password,repassword;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
	public String register()
	{
		String status=null;
		saveduo d=new saveduo();
		if(password.equals(repassword))
		{
			status=d.save(this);
		}else
		{
			return "error";
		}
		return status;
	}
	
	
	public String checkvalidation()
	{  
		String status=null;
		saveduo d=new saveduo();
		if(username.equals("admin") && password.equals("admin"))
		{
			return "admin";
		}
		else
		{
			
			status=d.check(this);
		
	    }
		return status;
		
	}
   
	

}
