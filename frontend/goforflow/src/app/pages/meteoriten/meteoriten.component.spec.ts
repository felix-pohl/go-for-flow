import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MeteoritenComponent } from './meteoriten.component';

describe('MeteoritenComponent', () => {
  let component: MeteoritenComponent;
  let fixture: ComponentFixture<MeteoritenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MeteoritenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MeteoritenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
