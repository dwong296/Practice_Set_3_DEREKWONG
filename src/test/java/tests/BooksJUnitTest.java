package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;
import java.util.Map;
import org.junit.Test;
import pkgLibrary.Book;
import pkgLibrary.BookException;

public class BooksJUnitTest {

	@Test
	public void GetBook1() 
	{
		Book b = new Book("bk101");
		assertTrue(b.getBook("bk101").getId().equals(b.getId()));
	}
	
	@Test
	public void GetBook2() 
	{
		Book b = new Book("bk101");
		assertNotEquals(b.getBook("bk102"), b);
	}
	
	@Test
	public void AddBook1() 
	{
		Book b = new Book("bk113", "Derek Wong", "Hold This L", "Nonfiction", 100.00, new Date(1,1,1,1,1), "The appropriate response to everything", 80.00);
		b.addBook("bk113", b);
		assertTrue((b.getBook("bk113") != null) && (b.getBook("bk113").getId().equals(b.getId())));
	}
	
	@Test
	public void AddBook2() 
	{
		Book b = new Book("bk114", "Derek Wong", "Did You Really Just Pay A Grand?", "Fiction", 1000.00, new Date(1,1,1,1,1), "I don't know does anyone even read this", 0.01);
		b.addBook("bk114", b);
		assertTrue((b.getBook("bk114") != null) && (b.getBook("bk114").getId().equals(b.getId())));
	}
}
