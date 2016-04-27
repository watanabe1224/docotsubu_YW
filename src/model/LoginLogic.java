package model;

public class LoginLogic {
	public boolean execute(User user) {
		if(user.getId()==1 && user.getPw()==1234) {
			return true;
		}
		return false;
	}
}
