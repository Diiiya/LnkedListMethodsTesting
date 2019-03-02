package listInterface;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListClassTestContains {

	LinkedList<String> a;
	boolean exists;

	@Before
	public void setUp() throws Exception 
	{
		 a = new LinkedList<String>(); 
		 a.add("apple"); 
	}
	
	@Test
	public void testTheListContainsASpecificValue() {
		if(a.contains("apple"))    
	        exists = true;
        assertEquals(true, exists);
	}
	
	@Test
	public void testTheListDoesNotContainASpecificElement() {
		if(a.contains("pear"))    
	        exists = true;
        assertNotEquals(true, exists);
	}
}
