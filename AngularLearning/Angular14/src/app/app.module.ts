import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { TransformDirective } from './transform.directive';
import { SafePipe } from './pipes/safe/safe.pipe';
import {CoreModule} from "./core/core.module";
import { ChatComponent } from './components/chat/chat.component';
import { UsersComponent } from './components/users/users.component';
import { EventBindingComponent } from './components/event-binding/event-binding.component';
import { HelloComponent } from './components/hello/hello.component';
import { CounterActionComponent } from './components/counter-action/counter-action.component';
import { ClassBindingsComponent } from './components/class-bindings/class-bindings.component';
import { ParentComponent } from './components/parent/parent.component';
import { ChildComponent } from './components/child/child.component';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    TransformDirective,
    SafePipe,
    ChatComponent,
    UsersComponent,
    UserComponent,
    EventBindingComponent,
    HelloComponent,
    CounterActionComponent,
    ClassBindingsComponent,
    ParentComponent,
    ChildComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CoreModule
  ],
  entryComponents:[],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
