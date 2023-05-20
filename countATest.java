 package testing;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		int output = test.countA("alphabet");  
        assertEquals(2,output);
	}

}
