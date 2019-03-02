package listInterface;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListClassTestRemoveByIndex {

	LinkedList<String> a;
	int fruitIndex;
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
	public void testTheValueIsNotAtTheIndexPositionItWasAfterRemoving() {
		fruitIndex = a.indexOf("banana");
        a.remove(fruitIndex);
        assertNotEquals("banana", a.get(1));
	}
	
	@Test
	public void testTheNextValueHasTakenTheIndex() {
		fruitIndex = a.indexOf("banana");
        a.remove(fruitIndex);
        assertEquals("carrot", a.get(1));
	}
	
	@Test
	public void testTheNewListSizeIsSmallerAfterRemovingAnElement() {
		fruitIndex = a.indexOf("banana");
        a.remove(fruitIndex);
        assertEquals(2, a.size());
	}
	
	@Test
	public void testTheListDoesNotContainTheRemovedValue() {
		fruitIndex = a.indexOf("banana");
        a.remove(fruitIndex);
		if(a.contains("banana"))    
	        exists = true;
        assertEquals(false, exists);
	}

}
