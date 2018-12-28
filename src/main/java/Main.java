package usermanagement;

import java.util.Scanner;
import loginpkg.Login;
import profilepkg.Profile;
import transpkg.Transaction;


public class Main{
  static boolean loginStatus = false;
  
  public static void main(String[] args) {
    while (!loginStatus) {
      System.out.println("You are not login yet, you must login first.");
	  System.out.print("Please input your username:");
	  Scanner sc = new Scanner(System.in);
	  String username = sc.nextLine();
	  System.out.print("\nPlease input your password:");
	  String password = sc.nextLine();
		
	  Login login = new Login();
	  f (login.login(username, password)) {
	    loginStatus = true;
		System.out.println("Welcome " + username);
	  }
	}
	
	Profile prof1 = new Profile("james", "13816976662");
	Profile prof2 = new Profile("henry", "18518168920");
	Profile prof3 = new Profile("karen", "16478352338");
	
	Transaction trans = new Transaction();
	trans.addProfile(prof1);
	trans.addProfile(prof2);
	trans.addProfile(prof3);
	
	System.out.println("Total " + trans.howMany() + " profiles.");
	System.out.println("They are:");
	
	trans.listProfiles();
	
	new Main().logout();
  
  }
  
  private void logout() {
    loginStatus = false;
  }
}
