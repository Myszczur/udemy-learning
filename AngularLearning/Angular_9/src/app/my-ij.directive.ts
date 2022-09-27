import {Directive, Input, ViewContainerRef, TemplateRef} from '@angular/core';

@Directive({
  selector: '[appMyIj]'
})
export class MyIjDirective {

  @Input() set appMyIj(condition: boolean) {
    if (!condition) {
      this.viewContainer.clear();
    } else if (condition) {
      this.viewContainer.createEmbeddedView(this.viewTemplate);
    }
  }


  constructor(private viewContainer: ViewContainerRef, private viewTemplate: TemplateRef<any>) {
  }

}
