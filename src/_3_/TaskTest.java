package _3_;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Test;

public class TaskTest {

	Task task = new Task();
	
	
	int list[] = {400,100,200,350,300,250};
	
	@Test
	public void test() {
		assertEquals(400, task.output(list));
	}

}
