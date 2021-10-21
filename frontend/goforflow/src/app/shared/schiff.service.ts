import { Injectable } from '@angular/core';
import { Schiff } from './schiff';

@Injectable({
  providedIn: 'root'
})
export class SchiffService {

  private schiff: Schiff;

  constructor() { }

  getSchiff(): Schiff {
    if (!this.schiff) {
      this.schiff =  {power: 100};
    }
    return this.schiff;
  }

  treffer(schaden: number): Schiff {
    this.getSchiff().power -= schaden;

    return this.schiff;
  }

}
