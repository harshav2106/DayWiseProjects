import { CommonModule } from '@angular/common';
import { Component, Input} from '@angular/core';
import { IFruit } from '../IFruit';

@Component({
  selector: 'app-displaylist',
  imports: [CommonModule],
  templateUrl: './displaylist.html',
  styleUrl: './displaylist.css'
})
export class Displaylist {
  @Input() fruit!:IFruit;
}
