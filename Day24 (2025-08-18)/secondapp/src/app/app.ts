import { Component, signal } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { Ex15Homecomp } from './ex-15-homecomp/ex-15-homecomp';


@Component({
  selector: 'app-root',
  imports: [FormsModule , Ex15Homecomp ],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('secondapp');
  name : string = "harsha";
  greet(){
    console.log(`Hello ${this.name} says Hello!`);

  }
}
