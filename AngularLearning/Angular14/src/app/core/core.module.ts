import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeaderComponent } from './header/header.component';
import { CorePipePipe } from './core-pipe.pipe';
import { CorePipeDirective } from './core-pipe.directive';



@NgModule({
  declarations: [
    HeaderComponent,
    CorePipePipe,
    CorePipeDirective
  ],
  exports: [
    HeaderComponent
  ],
  imports: [
    CommonModule
  ]
})
export class CoreModule { }
