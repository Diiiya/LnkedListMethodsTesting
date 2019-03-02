package listInterface;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class ListClassTestIndexOf {

	LinkedList<String> a;
	int fruitIndex;

	@Before
	public void setUp() throws Exception 
	{
		 a = new LinkedList<String>(); 
		 a.add("apple"); 
		 a.add("carrot"); 
	}
	
	@Test
	public void testGetTheRightIndexOfValue() {
        fruitIndex = a.indexOf("apple");
        assertEquals(0, fruitIndex);
	}
	
	@Test
	public void testGetTheIndexOfValueIsNotAnyOther() {
        fruitIndex = a.indexOf("orange");
        assertNotEquals(1, fruitIndex);
	}

}
