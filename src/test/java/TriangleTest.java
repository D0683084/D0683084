package triangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest { 
	
	@Test
	public void testCheckTriangle3() {
		triangle a = new triangle();
		assertEquals("�@��T����"   , a.CheckTriangle(2, 3, 4));
	}	

	@Test
	public void testCheckTriangle2() {
		triangle a = new triangle();
		assertEquals("���T����"     , a.CheckTriangle(1, 1, 1));
	}	
		
	
	@Test
	public void testCheckTriangle5() {
		triangle a = new triangle();
		
		assertEquals("���y�T����"   , a.CheckTriangle(1, 2, 2));
	}	
		
	@Test
	public void testCheckTriangle6() {
		triangle a = new triangle();
		assertEquals("�����T����"   , a.CheckTriangle(3, 4, 5));
	}	

	@Test
	public void testCheckTriangle7() {
		triangle a = new triangle();
	
		assertEquals("�@��T����"   , a.CheckTriangle(2, 3, 4));		
	} 
	
	@Test
	public void testCheckTriangle4() {
		triangle a = new triangle();
		
		assertEquals("���y�����T����" , a.CheckTriangle(1, 1, 1.414));

	}

	@Test
	public void testCheckTriangle1() {
		triangle a = new triangle();
		assertEquals("���O�T����"   , a.CheckTriangle(0, 0, 0));
		assertEquals("���O�T����"   , a.CheckTriangle(-1, 2, 3));
		assertEquals("���O�T����"   , a.CheckTriangle(2, -1, 5));		
	}
}
