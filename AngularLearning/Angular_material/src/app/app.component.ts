import {Component} from '@angular/core';

export interface Students {
  name: string;
  subject: string;
  rollNo: number;
  age: number;
}

const students_data: Students[] = [
  {name: "John", subject: "science", rollNo: 1, age: 33},
  {name: "Mark", subject: "math", rollNo: 2, age: 333},
  {name: "Max", subject: "math", rollNo: 3, age: 22},
  {name: "Jon", subject: "Mechanical", rollNo: 4, age: 66}
];

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular_material';

  col_names: string[] = ['name', 'subject', 'rollNo', 'age'];
  table_data = students_data;
}
