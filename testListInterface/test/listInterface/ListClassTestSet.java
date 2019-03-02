package listInterface;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListClassTestSet {

	LinkedList<String> a;
	boolean exists;

	@Before
	public void setUp() throws Exception 
	{
		 a = new LinkedList<String>(); 
		 a.add("apple"); 
		 a.add("carrot"); 
	}
	
	@Test
	public void testTheListContainsTheNewValue() {
		a.set(1, "banana"); 
		if(a.contains("banana"))    
	        exists = true;
        assertEquals(true, exists);
	}
	
	@Test
	public void testTheListDoesNotContainThePreviousValue() {
		a.set(1, "banana"); 
		if(a.contains("carrot"))    
	        exists = true;
        assertEquals(false, exists);
	}
	
	@Test
	public void testTheIndexOfTheNewValue() {
        a.set(1, "banana");   
        assertEquals("banana", a.get(1));
	}
	
	@Test
	public void testTheIndexOfTheFirstValueHasRemainedTheSame() {
        a.set(1, "banana");   
        assertEquals("apple", a.get(0));
	}
	
	@Test
	public void testTheListLenghtHasRemainedTheSame() {
        a.set(1, "banana");   
        assertEquals(2, a.size());
	}
	
}
