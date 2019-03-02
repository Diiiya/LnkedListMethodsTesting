package listInterface;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListClassTestClear {

	LinkedList<String> a;
	boolean isEmpty;

	@Before
	public void setUp() throws Exception 
	{
		 a = new LinkedList<String>(); 
		 a.add("apple"); 
		 a.add("banana");
		 a.add("carrot"); 
	}
	
	@Test
	public void testClear() {
		a.clear();
		if(a.isEmpty())    
	        isEmpty = true;
        assertEquals(true, isEmpty);
	}
	
	@Test
	public void testIfListIsEmptyAfterBeingClearedAndANewValueIsAdded() {
		a.clear();
		a.add("blueberry");
		if(a.isEmpty())    
	        isEmpty = true;
        assertNotEquals(true, isEmpty);
	}

}
