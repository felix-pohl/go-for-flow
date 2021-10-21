import { TestBed } from '@angular/core/testing';

import { SchiffService } from './schiff.service';

describe('SchiffService', () => {
  let service: SchiffService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SchiffService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
