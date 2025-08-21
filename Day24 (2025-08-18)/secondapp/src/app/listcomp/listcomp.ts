import { Component } from '@angular/core';
import { Condicomp } from '../condicomp/condicomp';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Ex15Homecomp } from '../ex-15-homecomp/ex-15-homecomp';

@Component({
  selector: 'app-listcomp',
  standalone:true,
  imports: [Condicomp,CommonModule,FormsModule,Ex15Homecomp],
  templateUrl: './listcomp.html',
  styleUrl: './listcomp.css'
})
export class Listcomp {
  nameList:String[]=["Harsha","Ashok","Srikanth","Badarinath"]

}
