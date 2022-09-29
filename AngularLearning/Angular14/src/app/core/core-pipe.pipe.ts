import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'corePipe'
})
export class CorePipePipe implements PipeTransform {

  transform(value: unknown, ...args: unknown[]): unknown {
    return null;
  }

}
