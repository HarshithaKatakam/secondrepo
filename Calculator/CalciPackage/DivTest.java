package CalciPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivTest {

	@Test
	public void test() {
		Demo d=new Demo();
		int res3=d.div(15,3);
		assertEquals(5,res3);
	}

}
