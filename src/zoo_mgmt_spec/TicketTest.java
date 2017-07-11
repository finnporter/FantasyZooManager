package zoo_mgmt_spec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import zoo_mgmt.Ticket;

public class TicketTest {
    Ticket ticket;
	
	@Before
	public void before() {
		ticket = new Ticket(15, false);
	}

	@Test
	public void hasPrice() {
		assertEquals(15, ticket.getPrice());
	}
	
	@Test
	public void hasConcession() {
		assertEquals(false, ticket.getConcession());
	}

}
