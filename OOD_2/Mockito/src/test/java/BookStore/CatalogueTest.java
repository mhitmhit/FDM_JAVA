package BookStore;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.anyDouble;

@ExtendWith(MockitoExtension.class)
class CatalogueTest {

	@Mock
	ReadItemCommand mockReadItemCommand;
	
	@Test
	public void getAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue() {
		// Arrange
		System.out.println("test 1:");
		Catalogue catalogue = new Catalogue(mockReadItemCommand);
		
		// Act
		ArrayList<Book> returnedList;
		returnedList = catalogue.getAllBooks();
	
		// Assert
		assertEquals(returnedList.size(), 0);
	}
	
	@Test
	public void getallBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled() {
		// Arr
		System.out.println("test 2: ");
		Catalogue catalogue = new Catalogue(mockReadItemCommand);
		
		// Act
		ArrayList<Book> returnedList = catalogue.getAllBooks();
 
		// Ass
		verify(mockReadItemCommand).readAll();
	}
	
	@Test
	public void getAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled() {
		System.out.println("test 3: ");
		Catalogue catalogue = new Catalogue(mockReadItemCommand);
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Book> bookList2 = new ArrayList<Book>();
		
		Book book1 = new Book("111111");
		Book book2 = new Book("222222");
		Book book3 = new Book("333333");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		bookList2.add(book3);
		bookList2.add(book3);
		
		when(mockReadItemCommand.readAll()).thenReturn(bookList);
		
		assertEquals(catalogue.getAllBooks(), bookList);
	}

	@Test
	public void addBook_PassGivenBookToInsertItemMethodFromWriteItemCommand() {
		
	}
}
