import {TestBed} from '@angular/core/testing';

import {BooksListingService} from './books-listing.service';

describe('BooksListingService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BooksListingService = TestBed.get(BooksListingService);
    expect(service).toBeTruthy();
  });
});
