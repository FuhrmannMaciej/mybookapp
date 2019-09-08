import {Observable} from 'rxjs';
import {Book} from '../model/book.model';
import {Component, OnInit} from '@angular/core';
import {BooksListService} from './books-list.service';

@Component({
  selector: "app-books-list",
  templateUrl: "./books-list.component.html",
  styleUrls: ["./books-list.component.css"]
})
export class BooksListComponent implements OnInit {
  books: Observable<Book[]>;

  constructor(private bookService: BooksListService) {
  }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.books = this.bookService.getAllBooks();
  }

  deleteBook(id: number) {
    this.bookService.deleteBook(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

}
