// package com.spring.spring;

// import java.util.ArrayList;
// import java.util.List;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.boot.test.mock.mockito.MockBean;
// import org.springframework.http.MediaType;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
// import static org.mockito.BDDMockito.given;
// import static org.mockito.Mockito.when;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.spring.spring.controller.BookController;
// import com.spring.spring.model.Books;
// import com.spring.spring.service.BookService;


// @WebMvcTest(value = BookController.class)
// public class BookControllerMockMVCIT {
//     @Autowired
//     private MockMvc mockMvc;

//     @MockBean
//     private BookService booksService;

//     public Books book1 = new BookBuilder().bookid(1).build();
//     public Books book2 = new BookBuilder().bookid(2).bookname("Book 2").build();

//     @Test
//     public void getAll() throws Exception {
//         List<Books> alist1 = new ArrayList<Books>();
//         alist1.add(book1);
//         given(booksService.getAllBooks()).willReturn(alist1);
//         mockMvc.perform(get("/book").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
//                 .andExpect(content().json("[{'id': 1}]"));
//     }

//     @Test
//     public void getOne() throws Exception {
//         int id = 2;
//         // List<Book> alist1 = new ArrayList<Book>();     
//         // alist1.add(book1);   
//         given(booksService.getBooksById(id)).willReturn(book2);
//         mockMvc.perform(get("/book/2").accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
//                 .andExpect(content().json("{'id': 2}"));
//     }

//     @Test
//          public void update() throws Exception {
//              int id = 2;
//              List<Books> alist1 = new ArrayList<Books>();
//               alist1.add(book1);
//               when(booksService.update(id,book2)).thenReturn(book2);
//                 mockMvc.perform( MockMvcRequestBuilders.put("/books/"+id).contentType(MediaType.APPLICATION_JSON).content(asJsonString(book2)))
//                 .andExpect(status().isOk());
//              }

//     @Test
//     public void postmapping() throws Exception {
//         List<Books> alist1 = new ArrayList<Books>();
//          alist1.add(book1);
//          when(booksService.saveOrUpdate(book1)).thenReturn(book1);
//           mockMvc.perform( post("/books/").contentType(MediaType.APPLICATION_JSON).content(asJsonString(book1)))
//           .andExpect(status().isCreated());
//                 // verify(accountService, times(1)).find(acc.getAccountId());  
//                 // verify(accountService, times(1)).save(acc);     
//             // verifyNoMoreInteractions(accountService); 
//          }

//     @Test
//     public void deleteByID() throws Exception {
//         List<Books> alist = new ArrayList<Books>();
//         alist.add(book1);
//         when((booksService).delete(book1.getBookid())).thenReturn(book1);
//         mockMvc.perform(delete("/book/1", book1.getBookid())).andExpect(status().is2xxSuccessful());
//         // verify(eventService, times(1)).find(currentevent.getId());       
//         // verify(bookService, times(1)).deleteBookById(book1.getId());   
//         // verifyNoMoreInteractions(bookService); 
//     }

//     public static String asJsonString(final Object obj) {
//         try {
//             final ObjectMapper mapper = new ObjectMapper();
//             return mapper.writeValueAsString(obj);
//         } catch (Exception e) {
//             throw new RuntimeException(e);
//         }
//     }

// }


