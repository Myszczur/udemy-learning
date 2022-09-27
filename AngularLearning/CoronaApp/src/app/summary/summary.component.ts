import {Component, OnInit, Input} from '@angular/core';

@Component({
  selector: 'app-summary',
  templateUrl: './summary.component.html',
  styleUrls: ['./summary.component.css']
})
export class SummaryComponent implements OnInit {
  @Input() globalData: any;

  constructor() {
  }

  ngOnInit(): void {
    if (Object.keys(this.globalData).length != 0) {
      console.log(this.globalData);
    }
  }
}
