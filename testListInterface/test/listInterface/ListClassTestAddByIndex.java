package listInterface;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListClassTestAddByIndex {

	LinkedList<String> a;

	@Before
	public void setUp() throws Exception 
	{
		 a = new LinkedList<String>(); 
		 a.add("banana"); 
	}
	
	@Test
	public void testInsertAtPreviousIndexNumber() {
        a.add(0, "apple");   
        assertEquals("apple", a.get(0));
	}
	
	@Test
	public void testNextValueRemainsInTheList() {
        a.add(0, "apple");   
        assertEquals("banana", a.get(1));
	}
	
	@Test
	public void testListLength() {
        a.add(0, "apple");   
        assertEquals(2, a.size());
	}
}
