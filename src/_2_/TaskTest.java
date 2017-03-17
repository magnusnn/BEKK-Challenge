package _2_;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

public class TaskTest {

	Task task = new Task();
	
	@Test
	public void test1() {
		int[][] list = {{3,5,5},{5,2,2}};
		
		assertEquals(12, task.timeTrafic(10, list));;
	}

	
	@Test
	public void test2() {
		assertEquals(2, task.checkRedLight(7, 3, 3));
	}
}
