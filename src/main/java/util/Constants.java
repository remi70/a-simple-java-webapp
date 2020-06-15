package util;

public class Constants {
	
	public static final String REGISTER = "/register";
	public static final String REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	public static final String REGISTRATION = "INSERT into user (first_name,last_name,email,password)values(?,?,?,?)";
	public static final String LOGIN = "SELECT * FROM user WHERE email=? AND password=?";
}
