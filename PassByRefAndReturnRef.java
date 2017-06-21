import java.util.Date;
import java.util.Scanner;

import javax.swing.text.View;
class MessageDTO{
	private String message;
	private String userid;
	private Date date;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
class UserDTO{
private String userid;
private String pwd;
private String userName;
private int age;
private String city;
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


}
class UserView
{
	void register(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String pwd = scanner.next();
		System.out.println("Enter the NAme");
		String userName = scanner.next();
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Enter the City");
		String city = scanner.next();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPwd(pwd);
		userDTO.setUserName(userName);
		userDTO.setCity(city);
		userDTO.setAge(age);
		UserDAO userDAO = new UserDAO();
		MessageDTO message = userDAO.storeData(userDTO);
		System.out.println(message.getMessage());
		System.out.println(message.getDate());
		System.out.println(message.getUserid());
		//userDAO.storeData(userid, pwd, userName, age, city);
		
	}
}
class UserDAO{
	
	//void storeData(String userid, String pwd, String userName , int age, String city){
		
	//}
	//int x[] = new int[5];
	int index = 0;
	private UserDTO users[] = new UserDTO[5];
	MessageDTO storeData(UserDTO userDTO){
		users[index ] = userDTO;
		index++;
		MessageDTO message = new MessageDTO();
		message.setMessage("Register Done...");
		message.setDate(new Date());
		message.setUserid(userDTO.getUserid());
		return message;
	}
}
public class PassByRefAndReturnRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserView uv = new UserView();
		uv.register();

	}

}
