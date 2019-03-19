package IPackage;
import static org.junit.Assert.*;
import org.junit.Test;
public class SimpleInterestTest {
	@Test
	public void test() {
		Demo d=new Demo();
		int res=d.sim(5,12,5);
		assertEquals(3,res);
	}
}
