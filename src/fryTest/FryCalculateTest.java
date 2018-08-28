package fryTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FryCalculateTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		FryCalculate  fry = new FryCalculate(); // SX1716004 fry add.
		int result = fry.add(1);
		if(result != 1) {
			fail(" add wrong");
		}
	}

	@Test
	public void testSub() {
		FryCalculate  fry = new FryCalculate(); // SX1716004 fry add.
		int result = fry.sub(1);
		if(result != 0) {
			fail(" sub wrong");
		}
	}

	@Test
	public void testMulti() {
		FryCalculate  fry = new FryCalculate(); // SX1716004 fry add.
		int result = fry.multi(1);
		if(result != 0) {
			fail(" multi wrong");
		}
	}

	@Test
	public void testDivide() {
		FryCalculate  fry = new FryCalculate(); // SX1716004 fry add.
		int result = fry.divide(0); // divide 0
		if(result != 0) {
			fail(" divide wrong");
		}
	}

}
