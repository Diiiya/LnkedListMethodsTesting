package listInterface;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListClassTestSize {

	LinkedList<String> a;
	int listSize;

	@Before
	public void setUp() throws Exception 
	{
		 a = new LinkedList<String>(); 
		 a.add("apple"); 
		 a.add("banana");
		 a.add("carrot"); 
	}
	
	@Test
	public void testListSize() {
        listSize = a.size();
        assertEquals(3, listSize);
	}
	
	@Test
	public void testListSizeAfterAddingAValue() {
		a.add("blueberry");
        listSize = a.size();
        assertEquals(4, listSize);
	}
	
	@Test
	public void testListSizeAfterRemovingAValue() {
		a.remove("apple");
        listSize = a.size();
        assertEquals(2, listSize);
	}

}
