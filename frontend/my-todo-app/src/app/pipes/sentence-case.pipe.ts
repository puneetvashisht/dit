import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'sentenceCase'
})
export class SentenceCasePipe implements PipeTransform {

  transform(title: string, ...args: unknown[]): unknown {
    console.log('in sentence case pipe ', title)
    let sentence : string = title[0].toUpperCase() + title.slice(1).toLowerCase();
    return sentence;
  }

}
