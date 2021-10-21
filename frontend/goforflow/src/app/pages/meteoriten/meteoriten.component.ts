import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-meteoriten',
  templateUrl: './meteoriten.component.html',
  styleUrls: ['./meteoriten.component.css'],
})
export class MeteoritenComponent implements OnInit {
  isStarted: boolean = false;

  constructor() {}

  ngOnInit(): void {}

  start() {}
}
