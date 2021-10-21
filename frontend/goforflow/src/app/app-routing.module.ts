import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { IntroComponent } from './pages/intro/intro.component';
import { MeteoritenComponent } from './pages/meteoriten/meteoriten.component';
import { SosComponent } from './pages/sos/sos.component';

const routes: Routes = [
  { component: MeteoritenComponent, path: 'meteoriten'},
  { component: SosComponent, path: 'sos'},
  { component: IntroComponent, path: '**' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
