// package com.spring.spring;

// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.when;

// import java.util.Arrays;
// import java.util.List;

// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.junit.jupiter.MockitoExtension;


// import com.spring.spring.controller.BookController;
// import com.spring.spring.model.Books;
// import com.spring.spring.service.BookService;

// @ExtendWith(MockitoExtension.class)
// public class BookControllerTest {
//     @Mock
// 	private BookService booksService;
  
// 	@InjectMocks
// 	private BookController bookController;

	
// 	public static List<Books> expected;
// 	Books book1 = new Books();
// 	Books book2 = new Books();

// 	@Test
// 	public void getallBooksTest() {
  
// 	  expected = Arrays.asList(book1);
// 	  System.out.println(expected);
// 	  when(booksService.getAllBooks()).thenReturn(expected);
// 	  List<Books> actual = bookController.getAllBooks();
// 	  assertNotNull(actual);
// 	//   assertEquals(expected, actual);
// 	//   assertEquals(HttpStatus.OK, actual);
// 	}
   
// @Test
//   public void getBookByIdTest() {
//        int id = 1;
//        when(( booksService).getBooksById(id)).thenReturn(book1);
//        Books actual = bookController.getBooks(id);
//        assertNotNull(actual);
	
//   }
//   @Test
//   public void createBookTest() {
//     // when(booksService.saveOrUpdate(book1)).thenReturn(book1);
// 	// when(booksService.saveOrUpdate(book1)).thenReturn(null);
//     bookController.saveBook(book1);
//   }

// @Test
//   public void updateBookTest() {   
//     Books actual = bookController.update(book1);
//     assertNotNull(actual);
//     System.out.println("Actual is  "+actual);
//     System.out.println("expected-->" + expected);
//     // assertEquals(edit, actual.getBody());
//   }

//   @Test
//   public void deleteBookTest() {
//     int id=1;
//     //when(booksService.delete(id)).thenReturn(book1);
//     bookController.deleteBook(id);
//     verify(booksService).delete(id);
//   }
// }
