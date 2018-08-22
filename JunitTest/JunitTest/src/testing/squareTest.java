package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int output=test.squire(5);
		assertEquals(25,output);
	}

}
