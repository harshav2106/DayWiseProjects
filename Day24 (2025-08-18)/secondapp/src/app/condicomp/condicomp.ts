import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-condicomp',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './condicomp.html',
  styleUrls: ['./condicomp.css']
})
export class Condicomp {
  // showMessage: boolean = false;

  // toggleMessage() {
  //   this.showMessage = !this.showMessage;
  // }
  // countries: string[]=["India","USA","UK","Germany"];
  // dropdownList : string[] = [];
  // loadCountries(){
  //   this.dropdownList=this.countries;
  // }
  // color:string="default";
  searchText: string = "";
  names: string[] = ["Harsha","jayantha","Ashok Reddy","Srikanth"];

}
