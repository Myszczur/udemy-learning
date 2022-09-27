import {Component, OnChanges, Input} from '@angular/core';

@Component({
  selector: 'app-allcountries',
  templateUrl: './allcountries.component.html',
  styleUrls: ['./allcountries.component.css']
})
export class AllcountriesComponent implements OnChanges {
  @Input() allCountriesData: any;

  constructor() {
  }

  ngOnChanges() {
  }
}
