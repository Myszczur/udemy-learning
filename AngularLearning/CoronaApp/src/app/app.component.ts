import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  globalData: any = {};
  allCountriesData: any = {};
  usData: any = {};

  constructor(public http: HttpClient) {
    this.http.get('https://api.covid19api.com/summary')
      .subscribe((value: any) => {
        this.globalData = value.Global;
        this.allCountriesData = value.Countries;
        this.allCountriesData.sort((a: any, b: any) => {
          return b.TotalConfirmed - a.TotalConfirmed;
        });
        this.allCountriesData.forEach((countryList: any) => {
          if (countryList.CountryCode == "US") {
            this.usData = countryList;
          }
        });
      });
  }

  title = 'CoronaApp';
}
