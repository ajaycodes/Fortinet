package fortinet;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SeparateintoKTest {

	@Test
	public void test1() {
		SeparateintoK obj=new SeparateintoK();
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		assertTrue(obj.separate(list, 1));
	}
	
	@Test
	public void test2() {
		SeparateintoK obj=new SeparateintoK();
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		assertTrue(obj.separate(list, 3));
	}
	
	@Test
	public void test3() {
		SeparateintoK obj=new SeparateintoK();
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		assertTrue(obj.separate(list, 1));
	}
	
	@Test
	public void test4() {
		SeparateintoK obj=new SeparateintoK();
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		assertFalse(obj.separate(list, 2));
	}
	
	@Test
	public void test5() {
		SeparateintoK obj=new SeparateintoK();
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		assertFalse(obj.separate(list, 2));
	}
	@Test
	public void test6() {
		SeparateintoK obj=new SeparateintoK();
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(3);
		assertTrue(obj.separate(list, 1));
	}
	@Test
	public void test7() {
		SeparateintoK obj=new SeparateintoK();
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(3);
		assertTrue(obj.separate(list, 3));
	}
	
	@Test
	public void test8() {
		SeparateintoK obj=new SeparateintoK();
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		assertFalse(obj.separate(list, 2));
	}
	
	@Test
	public void test9() {
		SeparateintoK obj=new SeparateintoK();
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(3);
		assertFalse(obj.separate(list, 4));
	}

}
