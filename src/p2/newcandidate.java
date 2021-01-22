package p2;

public class newcandidate {
	private String id,topic,name,address,mobile,eid,voteid,vote;

	

	public String getVote() {
		return vote;
	}

	public void setVote(String vote) {
		this.vote = vote;
	}

	public String getVoteid() {
		return voteid;
	}

	public void setVoteid(String voteid) {
		this.voteid = voteid;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String register()
	{
		String status=null;
		savedata d=new savedata();
	    status=d.save(this);
		return status;
	}
	
	public String registervote()
    { 
	   
	    savedata d=new savedata();
	   String status=d.savevote(this);
	    return status;	
	}
	
	public String checkvoteid()
	{
		String status=null;
	    savedata d=new savedata();
	    status=d.check(this);
	    return status;	
	}
	
	public String storevote()
	{
		String status=null;
	    savedata d=new savedata();
	    status=d.storevote(this);
	    return status;	
	
		
	}
		
	
}

