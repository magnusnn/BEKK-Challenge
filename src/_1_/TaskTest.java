package _1_;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskTest {

	Task task = new Task();
	
	@Test
	public void test1() {
		assertEquals(1, task.numberIn(10, 11));
	}
	
	@Test
	public void test2() {
		assertEquals(22,task.numberIn(100, 200));
	}

	@Test
	public void test3() {
		assertEquals(92, task.numberIn(0, 500));
	}
	
	@Test 
	public void test4() {
		assertEquals(1, task.numberIn(0, 1));
	}
	
}
