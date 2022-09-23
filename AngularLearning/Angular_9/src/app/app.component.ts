import {Component} from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  inputVal: string = "";
  collectedData = [];
  title: string = 'Angular_9';
  style1: boolean = false;

  newStyle() {
    return 'orange';
  }

  onClick(event: any) {
    console.log("You Clicked me!");
    console.log(event);
    // @ts-ignore
    this.collectedData.push(this.inputVal);
    this.inputVal = "";
    console.log(this.collectedData);
  }
}
