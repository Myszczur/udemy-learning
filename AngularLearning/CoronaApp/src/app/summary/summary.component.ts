import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-summary',
  templateUrl: './summary.component.html',
  styleUrls: ['./summary.component.css']
})
export class SummaryComponent implements OnInit {

  data: any = "";

  constructor(public http: HttpClient) {
    this.http.get('https://api.covid19api.com/summary').subscribe((value: any) => {
      this.data = value.Global;
    });
  }

  ngOnInit(): void {
  }

}
