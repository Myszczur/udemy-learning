import {Component, OnInit, Input} from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  @Input() getInput: string | undefined;

  constructor() {
  }

  ngOnInit(): void {
    console.log(this.getInput + "two headers");
  }

}
