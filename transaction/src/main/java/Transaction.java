package transpkg;

import java.util.List;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import profilepkg.Profile;
import loginpkg.Login;

/**
*
* Transaction class definition.
*
* @author james
*/

public class Transaction {
  private List<Profile> profiles = new ArrayList<>();
  private final Logger logger = LoggerFactory.getLogger(Transaction.class);
  
  public void addProfile(Profile prof) {
    profiles.add(prof);
  }
  
  public Profile getProfile(int i) {
    return profiles.get(i);
  }
  
  public Profile removeProfile() {
    return profiles.remove(0);
  }
  
  public long howMany() {
    return profiles.size();
  }
  
  public void listProfiles(){
    if (profiles.size() == 0) {
	  logger.info("No profiles");
	} else {
	  int i = 1;
	  for (Profile p: profiles) {
	    logger.info("profile{}: name: {}, phone number: {}.", i, p.getName(), p.getPhoneNumber());
		i++;
	  }
	}
  }
}