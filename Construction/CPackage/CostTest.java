package CPackage;
import static org.junit.Assert.*;
import org.junit.Test;
public class CostTest {

	@Test
	public void test() {
		Demo d=new Demo();
		int res1=d.cost("High",12,true);
		assertEquals(30000,res1);
		int res2=d.cost("High", 15, false);
		assertEquals(27000,res2);
		int res3=d.cost("Medium", 10, false);
		assertEquals(12000,res3);
		int res4=d.cost("Above", 11, false);
		assertEquals(16500,res4);
	}
}
