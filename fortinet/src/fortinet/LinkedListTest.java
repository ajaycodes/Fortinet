package fortinet;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test1() {
		LinkedList list=new LinkedList();
		assertTrue(list.checkEmpty());
		assertEquals(0,list.length());
		list.reverseLinklist(list.head);
		assertEquals(null,list.head);
		System.out.println("Test 1 passed");
	}
	
	@Test
	public void test2() {
		LinkedList list=new LinkedList();
		assertTrue(list.checkEmpty());
		assertEquals(0,list.length());
		list.add(1);
		assertFalse(list.checkEmpty());
		assertEquals(1,list.length());
		list.reverseLinklist(list.head);
		assertEquals(1,list.head.value);
		System.out.println("Test 2 passed");
		
	}
	
	@Test
	public void test3() {
		LinkedList list=new LinkedList();
		assertTrue(list.checkEmpty());
		assertEquals(0,list.length());
		list.add(1);
		assertFalse(list.checkEmpty());
		assertEquals(1,list.length());
		list.add(2);
		assertFalse(list.checkEmpty());
		assertEquals(2,list.length());
		list.reverseLinklist(list.head);
		assertEquals(2,list.head.value);
		System.out.println("Test 3 passed");
		
	}

}
