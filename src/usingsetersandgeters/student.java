package usingsetersandgeters;

public class student {

	
	public int employeid ;

	private String employename ;

    public 	String dateString ;

	public String Adders;
	
	public student(int employeid, String employename, String dateString, String adders) {
		super();
		this.employeid = employeid;
		this.employename = employename;
		this.dateString = dateString;
		Adders = adders;
	}
	
	public int getEmployeid() {
		return employeid;
	}

	public void setEmployeid(int employeid) {
		this.employeid = employeid;
	}

	public String getEmployename() {
		return employename;
	}

	public void setEmployename(String employename) {
		this.employename = employename;
	}

	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public String getAdders() {
		return Adders;
	}

	public void setAdders(String adders) {
		Adders = adders;
	}

	


}
