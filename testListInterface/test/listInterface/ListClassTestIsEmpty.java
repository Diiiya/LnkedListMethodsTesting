package listInterface;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListClassTestIsEmpty {

	LinkedList<String> a;
	LinkedList<String> b;
	boolean isEmpty;

	@Before
	public void setUp() throws Exception 
	{
		 a = new LinkedList<String>(); 
		 a.add("apple"); 
		 a.add("banana");
		 a.add("carrot"); 
		 
		 b = new LinkedList<String>();
	}
	
	@Test
	public void testTheListAIsNotEmpty() {
		if(a.isEmpty())    
	        isEmpty = true;
        assertNotEquals(true, isEmpty);
	}
	
	@Test
	public void testTheListBIsEmpty() {
		if(b.isEmpty())    
	        isEmpty = true;
        assertEquals(true, isEmpty);
	}

}
