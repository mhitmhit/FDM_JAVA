import { Component } from '@angular/core';

@Component({
  selector: 'app-exercise-categories',
  templateUrl: './exercise-categories.component.html',
  styleUrls: ['./exercise-categories.component.css']
})
export class ExerciseCategoriesComponent {

  categories: string[] = [
    'Home',
    'Electronics',
    'Fashion'
  ];

  constructor(){}

  
}

