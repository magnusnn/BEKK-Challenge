package _4_;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskTest {

	Task task = new Task();
	
	int list[] = {2,5,3,12,13,11};
	
	int list2[] = {3,5,1,4,2,1};
	
	@Test
	public void test() {
		assertEquals(2, task.compute(list));
	}
	
//	@Test
//	public void test2() {
//		assertEquals(expected, actual);
//	}

}
