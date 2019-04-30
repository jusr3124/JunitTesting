package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodOne {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.methodOne(5);
		assertEquals(25, output);
	}

}
