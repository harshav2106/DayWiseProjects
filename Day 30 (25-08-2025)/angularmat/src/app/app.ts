import { CommonModule } from '@angular/common';
import { Component, signal } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatNativeDateModule, MatOptionModule } from '@angular/material/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormField, MatFormFieldModule, MatLabel } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatListModule } from '@angular/material/list';
import { MatSelectModule } from '@angular/material/select';
import { MatStepperModule } from '@angular/material/stepper';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports:[MatNativeDateModule,MatDatepickerModule,MatSelectModule,MatOptionModule,MatListModule, FormsModule, CommonModule, MatLabel, MatFormField, ReactiveFormsModule, MatStepperModule, MatFormFieldModule, MatInputModule, MatButtonModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('angularmat');

  // cities: string[] = ['Kurnool', 'Bangalore', 'Hyderabad', 'Mumbai', 'Kerala'];
  // nameForm!: FormGroup;
  // ageForm!: FormGroup;
  // emailForm!: FormGroup;

  // constructor(private fb: FormBuilder) {}

  // ngOnInit(): void {
  //   this.nameForm = this.fb.group({
  //     name: ['', Validators.required],
  //   });

  //   this.ageForm = this.fb.group({
  //     age: ['', Validators.required],
  //   });

  //   this.emailForm = this.fb.group({
  //     email: ['', Validators.required],
  //   });
  // }

  // onSubmit() {
  //   alert(`Name: ${this.nameForm.value.name}
  //   Age: ${this.ageForm.value.age}
  //   Email: ${this.emailForm.value.email}`);

  // }
   
  // inputControl = new FormControl('');
  // get reversedText(): string {
  //   const value = this.inputControl.value || '';
  //   return value.split('').reverse().join('');
  // }
   regForm: FormGroup;

  subjects: string[] = ['Maths', 'Biology', 'Telugu', 'English'];

  constructor(private fb: FormBuilder) {
    this.regForm = this.fb.group({
      name: ['', [Validators.required,Validators.minLength(3)]],
      email: ['', [Validators.required, Validators.email]],
      dob: ['', Validators.required],
      subject: ['', Validators.required],
    });
  }

  onSubmit() {
    if (this.regForm.valid) {
      console.log('Form Submitted:', this.regForm.value);
    }
  }

 
}
