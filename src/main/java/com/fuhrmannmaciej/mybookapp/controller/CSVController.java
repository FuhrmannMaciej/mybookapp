package com.fuhrmannmaciej.mybookapp.controller;

//@RestController
//public class CSVController {
//
//    @Autowired
//    private BookService bookService;
//
//    @RequestMapping(value = "/bookFinder", produces = "books_noimg/csv")
//    public void findCities(HttpServletResponse response) throws IOException {
//
//        List<Book> books = bookService.findAll();
//
//        WriteCsvToResponse.writeBooks(response.getWriter(), books);
//    }
//
//    @RequestMapping(value = "/bookFinder/{bookId}", produces = "books_noimg/csv")
//    public void findCity(@PathVariable int bookId, HttpServletResponse response) throws IOException {
//
//        Book book = bookService.findById(bookId);
//        WriteCsvToResponse.writeBook(response.getWriter(), book);
//    }
//}
