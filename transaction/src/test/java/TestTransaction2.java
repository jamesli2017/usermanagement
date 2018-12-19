import junit.framework.*;
import profilepkg.Profile;
import transpkg.Transaction;

public class TestTransaction2 extends TestCase {
  Transaction trans_uut = null;
  
  public TestTransaction2(String name) {
    super(name);
  }

  protected void setUp() {
    trans_uut = new Transaction();
  }
  
  public void testRemoveProfile() {
	  assertEquals(0, trans_uut.howMany());
	  
	  Profile prof = new Profile("henry", "123123123");	  
	  trans_uut.addProfile(prof);
	  assertEquals(1, trans_uut.howMany());
	  
	  trans_uut.removeProfile();
	  assertEquals(0, trans_uut.howMany());
  }
  
  public void testGetProfile() {
    Profile prof = new Profile("james", "18518168920");
	trans_uut.addProfile(prof);
	assertEquals("james", trans_uut.getProfile(0).getName());
  }
}