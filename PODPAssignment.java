package HomeWorkAssignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PODPAssignment {
  
	PODPClassCode abcd;
	
  @Test
  public void f() 
  {  
	  abcd.Login("Admin","admin123"); 
	  abcd.printuser("Admin");
	  abcd.printpass("admin123");
  }
 

  @BeforeClass
  public void beforeClass() 
  {
	  abcd = new PODPClassCode();
  }

  @AfterClass
  public void afterClass() {
  }

}
