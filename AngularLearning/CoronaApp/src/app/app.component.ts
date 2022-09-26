import {Component} from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  posts: any;

  constructor(private http: HttpClient) {
    let params = new HttpParams().set("userId", "1");
    this.http
      .get("https://jsonplaceholder.typicode.com/posts", {params})
      .subscribe((value: any) => {
        this.posts = value;
        console.log(this.posts);
      });
  }
  title = 'CoronaApp';
}
