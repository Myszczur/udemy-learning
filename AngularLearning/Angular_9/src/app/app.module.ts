import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {HeaderComponent} from './header/header.component';
import {FormsModule} from "@angular/forms";
import { ColorChangerDirective } from './color-changer.directive';
import { MyIjDirective } from './my-ij.directive';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ColorChangerDirective,
    MyIjDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
