import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	@Test
	public void test() {
	Mathematics mathematics = new Mathematics();
	int result = mathematics.add(10, 20);
	assertEquals(30, result);
	
	int result1= mathematics.sub(69, 40);
	assertEquals(29, result1);
	}

}
