import junit.framework.*;
import profilepkg.Profile;
import transpkg.Transaction;

public class TestTransaction1 extends TestCase {
  Transaction trans_uut = null;
  
  public TestTransaction1(String name) {
    super(name);
  }

  protected void setUp() {
    trans_uut = new Transaction();
  }
  
  public void testAddProfile() {
	  Profile prof = new Profile("james", "13816976662");
	  
	  trans_uut.addProfile(prof);
	  
	  assertEquals(1, trans_uut.howMany());
  }
  
  public void testHowMany() {
    Profile[] profs = new Profile[10];
	
	System.out.println("Executing testHowMany()");
	
	for(int i = 0; i < 10; i++) {
	  profs[i] = new Profile(String.valueOf(i), String.valueOf(i));
	  trans_uut.addProfile(profs[i]);
	}
	
	assertEquals(10, trans_uut.howMany());
	
	trans_uut.removeProfile();
	assertEquals(9, trans_uut.howMany());
  }
}