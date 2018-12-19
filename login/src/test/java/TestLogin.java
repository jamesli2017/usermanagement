import junit.framework.*;
import loginpkg.Login;

public class TestLogin extends TestCase {
	
	public TestLogin(String name) {
	  super(name);
	}
  
  public void testLogin1() {
    Login login = new Login();
	String username = "james";
	String password = "login";
	System.out.println("Executing testLogin1()");
	assertTrue("Either username(james) or password is wrong or all wrong.", login.login(username, password));
  }
  
  public void testLogin2() {
    Login login = new Login();
	String username = "henry";
	String password = "login";
	
	System.out.println("Executing testLogin2()");
	assertTrue(login.login(username, password));
  }
}