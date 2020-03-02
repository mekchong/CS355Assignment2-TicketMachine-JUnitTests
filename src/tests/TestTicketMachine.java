package tests;

import code.TicketMachine;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/*
 * assert methods
 *  assertEquals (message, expected, actual)	
 *  assertEquals (expected, actual, delta)
 *  assertEquals (expected, actual)
 *  // many more versions of assertEquals(...)
 *  assertTrue (condition)
 *  assertFalse (condition)
 *  assertNotNull (object-variable)
 *  assertNull (object-variable)
 *  assertSame (object1, object2)
 *  assertNotSame (object1, object2)
 *  fail (message)
 */

public class TestTicketMachine {

	TicketMachine tm = null;

/*
	@Before
	public void setUp(){
		tm = new TicketMachine(100);
	}
*/
	@Test
	public void testTicketMachine() {
		tm = new TicketMachine(100);
		assertNotNull(tm);
	}

	@Test
	public void testGetCost() {
		TicketMachine tm = new TicketMachine(100);
		int cost = tm.getCost();
		assertEquals(100, cost);
	}

	@Test
	public void testGetCurrentCollected(){
		TicketMachine tm = new TicketMachine(100);
		tm.currentCollected(25);
		assertEquals(25, tm.getCurrentCollected());
	//	tm.currentCollected(-1);
	//	assertEquals("")
	}

	@Test
	public void testCurrentCollected(){
		TicketMachine tm = new TicketMachine(100);
		tm.currentCollected(-1);
		assertEquals();
	}

	@Test
	public void testPrintTicket(){
		TicketMachine tm = new TicketMachine(100);
		String ticket = tm.printTicket();
		assertEquals("This is your ticket", ticket);

	}

	@Test
	public void testGetTicketCount(){
		TicketMachine tm = new TicketMachine(100);
		//tm.printTicket();
		assertNotNull(tm.getTicketCount());
	}

	//@Test

}	// end - class TestTicketMachine
