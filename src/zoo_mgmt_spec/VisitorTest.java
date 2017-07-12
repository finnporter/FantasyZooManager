package zoo_mgmt_spec;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.*;

public class VisitorTest {
	Visitor visitor;
	
	@Before
	public void before() {
		visitor = new Visitor("Hawkeye Pierce", 200.0, 36);
	}
	
	@Test
	public void hasName() {
		assertEquals("Hawkeye Pierce", visitor.getName());
	}
	
	@Test
	public void hasCash() {
		assertEquals(200.0, visitor.getCash(), 0.01);
	}
	
	@Test
	public void hasAge() {
		assertEquals(36, visitor.getAge());
	}
}
