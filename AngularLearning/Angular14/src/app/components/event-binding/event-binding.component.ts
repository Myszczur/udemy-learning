import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-event-binding',
  templateUrl: './event-binding.component.html',
  styleUrls: ['./event-binding.component.css']
})
export class EventBindingComponent implements OnInit {

  animal: string = `ANIMAL`;

  constructor() {
  }

  ngOnInit(): void {
  }

  onClick() {
    alert('Button was clicked!')
  }

  onKeyUp(event: any) {
    console.log(event);
    event.code === 'Enter' && alert("Enter was pressed");
  }

}
