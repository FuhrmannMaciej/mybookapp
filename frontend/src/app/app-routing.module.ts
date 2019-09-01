import {AddBooksComponent} from './add-books/add-books.component';
import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {BooksListComponent} from './books-list/books-list.component';
import {BooksComponent} from './books/books.component';
import {RegistrationComponent} from './registration/registration.component';
import {LoginComponent} from './login/login.component';

const routes: Routes = [
  {path: '', redirectTo: 'books', pathMatch: 'full'},
  {path: 'books', component: BooksComponent},
  {path: 'list', component: BooksListComponent},
  {path: 'add', component: AddBooksComponent},
  {path: 'registration', component: RegistrationComponent},
  {path: 'login', component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {enableTracing: true})],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
