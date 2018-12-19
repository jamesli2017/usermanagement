package transpkg;

import profilepkg.Profile;
import loginpkg.Login;
import java.util.List;
import java.util.ArrayList;

public class Transaction {
  private List<Profile> profiles = new ArrayList<>();
  
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
    if(profiles.size() == 0) System.out.println("No profiles");
	else{
	  int i = 1;
	  for(Profile p: profiles) {
	    System.out.println("profile " + i + ": name: " + p.getName() + ", phone number: " + p.getPhoneNumber());
		i++;
	  }
	}
  }
}