package chapter09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTest {

	private static final Object Chainchaincalc1 = null;

	@Test
	void test() {
		Chain chaincalc1 = new AddNumbers();
		Chain chaincalc1= new SubNumbers();
		Chain chaincalc1 = new MultiplyNumbers();
		Chain chaincalc1 = new DivideNumbers();
		chaincalc1.setNextChain(chaincalc1);
		chaincalc2.setNextChain(chaincalc2);
		chaincalc3.setNextChain(chaincalc3);
		assertEquals(5.0,Chainchaincalc1.calculator(new Numbers(3.0,2.0"add")," "));
		assertEquals(1.0,Chainchaincalc1.calculator(new Numbers(3.0,2.0"sub")," "));
		assertEquals(6.0,Chainchaincalc1.calculator(new Numbers(3.0,2.0"mul")," "));
		assertEquals(1.5,Chainchaincalc1.calculator(new Numbers(3.0,2.0"divide")));
	}

}
