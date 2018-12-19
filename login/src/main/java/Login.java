package loginpkg;

import java.util.List;
import java.util.Arrays;

public class Login {
  private String password = "login";
  private String[] usernames = new String[]{"james", "henry"};
  
  public boolean login(String username, String password) {
    if(Arrays.asList(this.usernames).contains(username)) {
	  if(password.equals(this.password)) return true;
	  else return false;
	}
	else
	  return false;
  }
}