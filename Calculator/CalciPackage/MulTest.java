package CalciPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest {

	@Test
	public void Multest() {
		Demo d=new Demo();
		int res2=d.mul(5, 7);
		assertEquals(35,res2);
	}

}
