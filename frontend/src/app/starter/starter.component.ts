import {AfterViewInit, Component} from '@angular/core';

@Component({
  templateUrl: './starter.component.html'
})
export class StarterComponent implements AfterViewInit {
  subtitle: string;

  constructor() {
    this.subtitle = 'Welcome to My Book List.';
  }

  ngAfterViewInit() {
  }
}
