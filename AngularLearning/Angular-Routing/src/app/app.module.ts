import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { BlogComponent } from './components/blog/blog.component';
import { HeaderComponent } from './components/header/header.component';
import { UsersComponent } from './components/users/users.component';
import { UsersDetailComponent } from './components/users-detail/users-detail.component';
import { UserComponent } from './components/user/user.component';
import { PlaceholderComponent } from './components/placeholder/placeholder.component';
import {AuthGuard} from "./guards/auth/auth.guard";
import {ConfirmationGuard} from "./guards/confirmation/confirmation.guard";
import {UserService} from "./services/user/user.service";

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutComponent,
    BlogComponent,
    HeaderComponent,
    UsersComponent,
    UsersDetailComponent,
    UserComponent,
    PlaceholderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AppRoutingModule
  ],
  providers: [AuthGuard, ConfirmationGuard, UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
