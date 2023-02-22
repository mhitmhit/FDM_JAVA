import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor() { }

  getCategories(): string[]{
    return [
      'Home',
      'Electronics',
      'Fashion',
      'Garden'
    ]
  }
}
