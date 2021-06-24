package servlet;

import java.util.ArrayList;
import java.util.List;


public class UserServece {
	private static UserServece userServece;
	private List<User> listOfUser = new ArrayList();
	
	private UserServece(){
		
	}
	static UserServece getUserServece() {
		if(userServece == null) {
			userServece = new UserServece();
		}
		return userServece;
	}
	
	
	public List<User> getListOfUser (){
		return listOfUser;
	}
	
     public void  saveUser (User user){
    	 listOfUser.add(user);
	}
	
     public User getUser(String email) {
    	return listOfUser.stream().filter(user->user.getEmail().equals(email)).findFirst().get();
    
     }
     
}

