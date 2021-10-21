import { Component, OnInit } from '@angular/core';
import { Meteorit } from 'src/app/shared/meteorit';
import { MeteoritenService } from 'src/app/shared/meteoriten.service';

@Component({
  selector: 'app-meteoriten',
  templateUrl: './meteoriten.component.html',
  styleUrls: ['./meteoriten.component.css'],
})
export class MeteoritenComponent implements OnInit {
  isStarted: boolean = false;
  meteorit: Meteorit|null = null;

  constructor(private meteoritenService: MeteoritenService) {}

  getMeteoriten() {
    this.meteorit = this.meteoritenService.genMeteorit();
  }

  ngOnInit(): void {}

  start() {
    this.isStarted = true;
    this.getMeteoriten();
  }
}
