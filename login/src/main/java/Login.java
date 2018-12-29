package loginpkg;

import java.util.List;
import java.util.Arrays;

/**
* Processing login.
* 
* @author james
*/

public class Login {
  private String password = "login";
  private String[] usernames = new String[]{"james", "henry"};
  
  /**
  * Login process.
  *
  * @param username string style
  * @param password String string
  * @return boolean true or false
  */
  public boolean login(String username, String password) {
    if (Arrays.asList(this.usernames).contains(username)) {
	  if(password.equals(this.password)) return true;
	  else return false;
	} else {
	  return false;
	}
  }
}