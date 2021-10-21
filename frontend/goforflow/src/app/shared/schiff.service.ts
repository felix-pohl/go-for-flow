import { Injectable } from '@angular/core';
import { Schiff } from './schiff';

@Injectable({
  providedIn: 'root'
})
export class SchiffService {

  private schiff: Schiff;

  constructor() { }

  getSchiff(): Schiff{
    const schiff: Schiff = {power: 100};
    this.schiff = schiff;
    return schiff; 
  }

}
