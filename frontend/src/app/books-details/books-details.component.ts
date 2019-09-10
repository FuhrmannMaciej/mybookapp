import {Book} from '../../model/book.model';
import {Component, Input, OnInit} from '@angular/core';
import {BooksListComponent} from '../books-list/books-list.component';
import {BooksListingService} from '../books-listing.service';

@Component({
  selector: 'app-books-details',
  templateUrl: './books-details.component.html',
  styleUrls: ['./books-details.component.css']
})
export class BooksDetailsComponent implements OnInit {

  @Input() book: Book;

  constructor(private bookService: BooksListingService, private listComponent: BooksListComponent) {
  }

  ngOnInit() {
  }
}
