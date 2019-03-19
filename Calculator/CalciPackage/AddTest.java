package CalciPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void Addtest() {
		Demo d=new Demo();
		int res=d.add(5, 7);
		assertEquals(12,res);
	}
}
