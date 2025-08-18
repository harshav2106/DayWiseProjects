import { CommonModule } from '@angular/common';
import { Component,Input } from '@angular/core';

@Component({
  selector: 'app-ex-15-bookcomp',
  imports: [CommonModule],
  templateUrl: './ex-15-bookcomp.html',
  styleUrl: './ex-15-bookcomp.css'
})
export class Ex15Bookcomp {
  @Input() title!: string;
  @Input() description!: string;
  @Input() image!: string;

}
