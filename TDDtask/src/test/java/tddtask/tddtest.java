package tddtask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tddtest {

	@Test
	public void test1() {
		assertEquals("BCD",deletion.del("ABCD"));
	}
	@Test
	public void test2() {
		assertEquals("CD",deletion.del("AACD"));
	}
	@Test
	public void test3() {
		assertEquals("BCD",deletion.del("BACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",deletion.del("BBAA"));
	}
	@Test
	public void test5() {
		assertEquals("BAA",deletion.del("AABAA"));
	}
	@Test
	public void test6() {
		assertEquals("",deletion.del(""));
	}
	@Test
	public void test7() {
		assertEquals("",deletion.del("A"));
	}
}
