import {Routes} from '@angular/router';
import {BooksListComponent} from './books/books-list/books-list.component';

export const ComponentsRoutes: Routes = [
  {
    path: '',
    children: [
      {
        path: 'list',
        component: BooksListComponent,
      }
    ]
  }
];
