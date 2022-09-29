import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-counter-action',
  templateUrl: './counter-action.component.html',
  styleUrls: ['./counter-action.component.css']
})
export class CounterActionComponent implements OnInit {

  // @Input() counter: number = 0;
  @Output() counterChange: EventEmitter<string> = new EventEmitter<string>();

  constructor() {
  }

  ngOnInit(): void {
  }

  handleButton(operation: string) {
    // operation == 'INC' ? this.counter++ : this.counter--;
    // @ts-ignore
    this.counterChange.emit(this.counter);
    console.log(operation);
  }

}
