package co.com.automationchronus.models;

public class User {

	public String user;
	public String password;
	public String validation_message;
	
	public void setUser(String user) {
		this.user = user;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public String getPassword() {
		return password;
	}
	public String getValidation_message() {
		return validation_message;
	}
	public void setValidation_message(String validation_message) {
		this.validation_message = validation_message;
	}
	

}
