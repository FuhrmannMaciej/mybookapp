import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BooksListService {

  private baseUrl = '/books';
  private listUrl = '/list';

  constructor(private http: HttpClient) {
  }

  getBook(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  addBook(book: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, book);
  }

  updateBook(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteBook(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, {responseType: 'text'});
  }

  getAllBooks(): Observable<any> {
    return this.http.get(`${this.baseUrl}${this.listUrl}`);
  }
}
