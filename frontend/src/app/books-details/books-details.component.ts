import {Book} from '../../model/book.model';
import {Component, Input, OnInit} from '@angular/core';
import {BookService} from '../books-list/books-list.service';
import {BooksListComponent} from '../books-list/books-list.component';

@Component({
  selector: 'app-books-details',
  templateUrl: './books-details.component.html',
  styleUrls: ['./books-details.component.css']
})
export class BooksDetailsComponent implements OnInit {

  @Input() book: Book;

  constructor(private bookService: BookService, private listComponent: BooksListComponent) {
  }

  ngOnInit() {
  }
}
