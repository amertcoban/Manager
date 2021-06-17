package ödevAboutInheritance;

public class User extends Default {
	
	private String userNumber;
	private String userColour;
	private String userJob;
	
	public String getUserNumber () {
		return userNumber ;
	}
	
	public void setUserNumber (String userNumber) {
		this.userNumber=userNumber;
	}
	
	public String getUserColour () {
		return userColour;
	}
	public void setUserColour (String userColour) {
		this.userColour=userColour;
	}
	
	public String getUserJob () {
		return userJob;
	}
	public void setUserJob (String userJob) {
		this.userJob=userJob;
	}
	
	

}
