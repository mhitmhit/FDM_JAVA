import { ProductsService } from './../../../services/products.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-exercise-categories',
  templateUrl: './exercise-categories.component.html',
  styleUrls: ['./exercise-categories.component.css']
})
export class ExerciseCategoriesComponent implements OnInit {

  categories: string[] = [];

  constructor(private ProductsService: ProductsService){}

  ngOnInit(): void {
    this.categories = this.ProductsService.getCategories();
  }

}

