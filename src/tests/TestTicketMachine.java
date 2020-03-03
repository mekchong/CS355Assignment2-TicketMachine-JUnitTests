package tests;

import code.TicketMachine;
import static org.junit.Assert.*;

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
	public void testCurrentCollected(){
		TicketMachine tm = new TicketMachine(100);
		tm.currentCollected(-1);
		assertEquals("Negative numbers cannot be inserted",0, tm.getCurrentCollected());
		tm.currentCollected(100);
		assertEquals("Inserting ticket money amount incorrect",100, tm.getCurrentCollected());
		tm.currentCollected(50);
		assertEquals("Adding money towards partially paid ticket incorrect",150, tm.getCurrentCollected());
	}

	@Test
	public void testPrintTicket(){
		TicketMachine tm = new TicketMachine(100);
		tm.currentCollected(100);
		String ticket = tm.printTicket();
		assertEquals("This is your regular ticket", ticket);
		tm = new TicketMachine(100);
		tm.currentCollected(20);
		assertEquals("Insufficient funds", tm.printTicket());
	}

	@Test
	public void testRefundAmount(){
		TicketMachine tm = new TicketMachine(100);
		tm.currentCollected(125);
		tm.printTicket();
		assertEquals("Refund balance amount incorrect", 25, tm.getRefundAmount());
	}

	@Test
	public void testAmountRequired(){
		TicketMachine tm = new TicketMachine(100);
		tm.currentCollected(25);
		tm.printTicket();
		assertEquals("Amount required to complete ticket incorrect", 75, tm.getAmountRequired());
	}

	@Test
	public void testTotalMoney(){
		TicketMachine tm = new TicketMachine(100);
		for(int i = 0; i < 3; i++){
			tm.currentCollected(100);
			tm.printTicket();
		}
		for(int i = 0; i < 3; i++){
			tm.currentCollected(200);
		}
		assertEquals("Total amount of money collected incorrect",900, tm.getTotalMoney());
	}

	@Test
	public void testFirstClass(){
		TicketMachine tm = new TicketMachine(100);
		tm.currentCollected(200);
		tm.firstClass();
		assertEquals(0, tm.getCurrentCollected());
		assertEquals(1, tm.getFCTicketCount());
	}

	@Test
	public void testGetTicketCount(){
		TicketMachine tm = new TicketMachine(100);
		tm.currentCollected(100);
		tm.printTicket();
		tm.currentCollected(100);
		tm.printTicket();
		assertEquals("Number of tickets incorrect",2, tm.getGrandTicketCount());
	}

	@Test
	public void testMoneyReport(){
		TicketMachine tm = new TicketMachine(100);
		tm.currentCollected(100);
		tm.printTicket();
		tm.currentCollected(2000);
		tm.firstClass();
		tm.firstClass();
		tm.firstClass();
		tm.firstClass();
		tm.printTicket();
		assertEquals("Incorrect total tickets", 6, tm.getGrandTicketCount());
		assertEquals("Incorrect total money", 1000, (tm.getFCTicketCount()*tm.getCost()*2 + (tm.getTicketCount()*tm.getCost())));
	}

}	// end - class TestTicketMachine