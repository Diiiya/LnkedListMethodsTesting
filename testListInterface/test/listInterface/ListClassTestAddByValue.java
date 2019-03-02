package listInterface;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListClassTestAddByValue {

	LinkedList<String> a;

	@Before
	public void setUp() throws Exception 
	{
		 a = new LinkedList<String>(); 
	}
	
	@Test
	public void testOneAddedValue() {
        a.add("apple");   
        assertEquals("apple", a.get(0));
	}
	
	@Test
	public void testTwoAddedValues() {
        a.add("apple"); 
        a.add("orange"); 
        assertEquals("orange", a.get(1));
	}
	
	@Test
	public void testListOfOneValuesLength() {
        a.add("apple");   
        assertEquals(1, a.size());
	}
	
	@Test
	public void testListOfTwoValuesLength() {
        a.add("apple");
        a.add("orange");
        assertEquals(2, a.size());
	}
}
