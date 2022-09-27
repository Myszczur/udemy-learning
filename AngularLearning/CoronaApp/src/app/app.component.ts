import {Component} from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  globalData: any;

  constructor(public http: HttpClient) {
    this.http.get('https://api.covid19api.com/summary')
      .subscribe((value: any) => {
        console.log(value);
        this.globalData = value.Global;
      });
  }

  title = 'CoronaApp';
}
