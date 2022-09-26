import {Directive, ElementRef, Input, OnInit, HostListener} from '@angular/core';


@Directive({
  selector: '[appColorChanger]'
})
export class ColorChangerDirective implements OnInit {

  @Input() bgColor: string | undefined;
  @Input() txtColor: string | undefined;

  @HostListener('mouseenter') onMouseEnter() {
    this.el.nativeElement.style.color = this.txtColor;
    this.el.nativeElement.style.backgroundColor = this.bgColor;
  }
  @HostListener('mouseleave') onMouseLeave(){
    this.el.nativeElement.style.color = null;
    this.el.nativeElement.style.backgroundColor = null;
  }
  constructor(private el: ElementRef) {

    console.log("This is the directive");
  }

  ngOnInit() {

  }

}
