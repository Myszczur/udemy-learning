import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {HttpClientModule} from "@angular/common/http";
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import { SummaryComponent } from './summary/summary.component';
import { MainCountryComponent } from './main-country/main-country.component';
import { AllcountriesComponent } from './allcountries/allcountries.component';

@NgModule({
  declarations: [
    AppComponent,
    SummaryComponent,
    MainCountryComponent,
    AllcountriesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
