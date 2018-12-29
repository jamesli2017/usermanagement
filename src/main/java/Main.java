package usermanagement;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import loginpkg.Login;
import profilepkg.Profile;
import transpkg.Transaction;

/**
* Program entry.
*
* @author james
*/

public class Main{
  static boolean loginStatus = false;
  
  public static void main(String[] args) {
	final Logger logger = LoggerFactory.getLogger(Main.class);
	
    while (!loginStatus) {
      logger.info("You are not login yet, you must login first.");
	  logger.info("Please input your username:");
	  Scanner sc = new Scanner(System.in);
	  String username = sc.nextLine();
	  logger.info("\nPlease input your password:");
	  String password = sc.nextLine();
		
	  Login login = new Login();
	  if (login.login(username, password)) {
	    loginStatus = true;
		logger.info("Welcome {}", username);
	  }
	}
	
	Profile prof1 = new Profile("james", "13816976662");
	Profile prof2 = new Profile("henry", "18518168920");
	Profile prof3 = new Profile("karen", "16478352338");
	
	Transaction trans = new Transaction();
	trans.addProfile(prof1);
	trans.addProfile(prof2);
	trans.addProfile(prof3);
	
	logger.info("Total {} profiles.", trans.howMany());
	logger.info("They are:");
	
	trans.listProfiles();
	
	new Main().logout();
  
  }
  
  private void logout() {
    loginStatus = false;
  }
}
