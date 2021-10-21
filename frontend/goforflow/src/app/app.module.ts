import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { IntroComponent } from './pages/intro/intro.component';
import { SosComponent } from './pages/sos/sos.component';
import { MeteoritenComponent } from './meteoriten/meteoriten.component';

@NgModule({
  declarations: [
    AppComponent,
    IntroComponent,
    SosComponent,
    MeteoritenComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
