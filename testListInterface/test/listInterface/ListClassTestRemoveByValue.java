package listInterface;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListClassTestRemoveByValue {

	LinkedList<String> a;
	boolean exists;

	@Before
	public void setUp() throws Exception 
	{
		 a = new LinkedList<String>(); 
		 a.add("apple"); 
		 a.add("banana");
		 a.add("carrot"); 
	}
	
	@Test
	public void testTheListDoesNotContainTheRemovedValue() {
		a.remove("banana");
		if(a.contains("banana"))    
	        exists = true;
        assertEquals(false, exists);
	}
	
	@Test
	public void testTheNewListSize() {
        a.remove("banana");
        assertEquals(2, a.size());
	}

}
