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


	@Before
	public void setUp(){
		tm = new TicketMachine(100);
	}

	@Test
	public void testTicketMachine() {
		assertNotNull(tm);
	}

	@Test
	public void testGetCost() {
		//TicketMachine tm = new TicketMachine(100);
		int cost = tm.getCost();
		assertEquals(100, cost);
	}

	//@Test
	public void testRefund(){

	}
	@Test
	public void testPrintTicket(){
		//TicketMachine tm = new TicketMachine(100);
		String ticket = tm.printTicket();
		assertEquals("This is your ticket", ticket);
	}
}	// end - class TestTicketMachine
