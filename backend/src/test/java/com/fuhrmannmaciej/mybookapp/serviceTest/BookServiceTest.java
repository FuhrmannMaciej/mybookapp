package com.fuhrmannmaciej.mybookapp.serviceTest;

import com.fuhrmannmaciej.mybookapp.entity.Book;
import com.fuhrmannmaciej.mybookapp.repository.BookRepository;
import com.fuhrmannmaciej.mybookapp.service.BookService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.of;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {

    private static final Integer ID = 1;
    private static final String AUTHOR = "Suzanne Collins";
    private static final Integer YEAR_OF_RELEASE = 2008;
    private static final String TITLE = "The Hunger Games";
    private static final Double RATING = 4.34;
    private static final Book defaultBook = new Book(ID, TITLE, YEAR_OF_RELEASE, RATING, AUTHOR);

    private BookService bookService;

    @MockBean
    private BookRepository bookRepositoryMock;

    @Before
    public void setUp() {
        bookRepositoryMock = mock(BookRepository.class);
        bookService = new BookService(bookRepositoryMock);
    }

    @Test
    public void testFindAllBooks() {

        List<Book> books = new ArrayList<>();
        when(bookRepositoryMock.findAll()).thenReturn(books);

        List<Book> returned = bookService.findAll();

        assertEquals(books, returned);
    }

    @Test
    public void testFindById() {

        given(bookRepositoryMock.findById(defaultBook.getId())).willReturn(of(defaultBook));

        Book bookFound = bookService.findById(defaultBook.getId());

        assertThat(bookFound).isEqualToComparingFieldByField(defaultBook);

    }
}
