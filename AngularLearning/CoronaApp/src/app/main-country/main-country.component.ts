import {Component, OnChanges, Input} from '@angular/core';

@Component({
  selector: 'app-main-country',
  templateUrl: './main-country.component.html',
  styleUrls: ['./main-country.component.css']
})
export class MainCountryComponent implements OnChanges {
  @Input() usData: any;

  constructor() {
  }

  ngOnChanges() {
    console.log(this.usData);
  }

}
