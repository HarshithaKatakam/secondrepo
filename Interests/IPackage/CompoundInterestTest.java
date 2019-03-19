package IPackage;

import static org.junit.Assert.*;

import org.junit.Test;
public class CompoundInterestTest {

	@Test
	public void test() {
		Demo d=new Demo();
		int res=d.com(5,1,20);
		assertEquals(5,res);
	}

}
