package profilepkg;

public class Profile {
  private String name;
  private String phoneNumber;
  
  public Profile(String username, String phoneNumber) {
    this.name = username;
	this.phoneNumber = phoneNumber;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  
  public String getPhoneNumber() {
	  return this.phoneNumber;
  }
}