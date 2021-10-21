import { Injectable } from '@angular/core';
import { Meteorit } from './meteorit';
import { MeteoritenColor } from './meteorit-color';

@Injectable({
  providedIn: 'root',
})
export class MeteoritenService {
  private currentMeteorit: Meteorit|null = null;

  constructor() {}

  genMeteorit(): Meteorit {
    const rng = Math.floor(Math.random()*6);
    const rng2 = Math.floor(Math.random()*6);
    const meteorit = {
      color: Object.values(MeteoritenColor)[rng],
      text: Object.values(MeteoritenColor)[rng2],
    };
    this.currentMeteorit = meteorit;
    return this.currentMeteorit;
  }
}
