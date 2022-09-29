import {Component, EventEmitter, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-counter-action',
  templateUrl: './counter-action.component.html',
  styleUrls: ['./counter-action.component.css']
})
export class CounterActionComponent implements OnInit {

  @Output() counterChange: EventEmitter<string> = new EventEmitter<string>();

  constructor() {
  }

  ngOnInit(): void {
  }

  handleButton(operation: string) {
    this.counterChange.emit(operation);
    console.log(operation);
  }

}
