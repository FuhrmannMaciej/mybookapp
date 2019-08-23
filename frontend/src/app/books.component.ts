import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";

import {Book} from '../model/book.model'

@Component({
  selector: 'books-root',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {
  title = 'mybookapp';
  books: Book[];

  constructor(private router: Router, private bookService: BookService) {

  }

  ngOnInit(): void {
  }
}
