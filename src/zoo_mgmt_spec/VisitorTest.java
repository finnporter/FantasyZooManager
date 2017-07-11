package zoo_mgmt_spec;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.Ticket;
import zoo_mgmt.Visitor;

public class VisitorTest {
	Visitor visitor;
	
	@Before
	public void before() {
		visitor = new Visitor("Hawkeye Pierce", 200, 36);
	}
	
	@Test
	public void hasName() {
		assertEquals("Hawkeye Pierce", visitor.getName());
	}
	
	@Test
	public void hasCash() {
		assertEquals(200, visitor.getCash(), 0.01);
	}
	
	@Test
	public void hasAge() {
		assertEquals(36, visitor.getAge());
	}
}
