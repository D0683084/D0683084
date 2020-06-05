package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest { 
	
	@Test
	public void testCheckTriangle3() {
		triangle a = new triangle();
		assertEquals("一般三角形"   , a.CheckTriangle(2, 3, 4));
	}	

	@Test
	public void testCheckTriangle2() {
		triangle a = new triangle();
		assertEquals("正三角形"     , a.CheckTriangle(1, 1, 1));
	}	
		
	
	@Test
	public void testCheckTriangle5() {
		triangle a = new triangle();
		
		assertEquals("等腰三角形"   , a.CheckTriangle(1, 2, 2));
	}	
		
	@Test
	public void testCheckTriangle6() {
		triangle a = new triangle();
		assertEquals("直角三角形"   , a.CheckTriangle(3, 4, 5));
	}	

	@Test
	public void testCheckTriangle7() {
		triangle a = new triangle();
	
		assertEquals("一般三角形"   , a.CheckTriangle(2, 3, 4));		
	} 
	
	@Test
	public void testCheckTriangle4() {
		triangle a = new triangle();
		
		assertEquals("等腰直角三角形" , a.CheckTriangle(1, 1, 1.414));

	}

	@Test
	public void testCheckTriangle1() {
		triangle a = new triangle();
		assertEquals("不是三角形"   , a.CheckTriangle(0, 0, 0));
		assertEquals("不是三角形"   , a.CheckTriangle(-1, 2, 3));
		assertEquals("不是三角形"   , a.CheckTriangle(2, -1, 5));		
	}
}
