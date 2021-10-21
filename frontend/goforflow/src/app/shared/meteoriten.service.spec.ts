import { TestBed } from '@angular/core/testing';

import { MeteoritenService } from './meteoriten.service';

describe('MeteoritenService', () => {
  let service: MeteoritenService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MeteoritenService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
