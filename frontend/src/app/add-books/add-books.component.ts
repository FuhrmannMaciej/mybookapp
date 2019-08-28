import {BooksListingService} from '../books-listing.service';
import {Book} from '../../model/book.model';
import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-add-books',
  templateUrl: './add-books.component.html',
  styleUrls: ['./add-books.component.css']
})
export class AddBooksComponent implements OnInit {

  book: Book = new Book();
  submitted = false;

  constructor(private bookService: BooksListingService) {
  }

  ngOnInit() {
  }

  newBook(): void {
    this.submitted = false;
    this.book = new Book();
  }


  save() {
    this.bookService.addBook(this.book)
      .subscribe(data => console.log(data), error => console.log(error));
    this.book = new Book();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }
}
