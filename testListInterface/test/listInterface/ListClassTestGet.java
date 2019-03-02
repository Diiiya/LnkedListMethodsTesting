package listInterface;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListClassTestGet {

	LinkedList<String> a;
	String fruit;

	@Before
	public void setUp() throws Exception 
	{
		 a = new LinkedList<String>(); 
		 a.add("apple"); 
	}
	
	@Test
	public void testGetIndexIsAssignedToTheRightValue() {
        fruit = a.get(0);
        assertEquals("apple", fruit);
	}
	
	@Test
	public void testGetIndexIsNotAssignedToAnyOotherValue() {
        fruit = a.get(0);
        assertNotEquals("orange", fruit);
	}
}
