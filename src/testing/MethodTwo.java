package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MethodTwo {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.methodTwo("javabean");
		assertEquals(3, output);
	}

}
