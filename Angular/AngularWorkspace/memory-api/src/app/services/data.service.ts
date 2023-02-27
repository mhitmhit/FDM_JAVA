import { Injectable } from '@angular/core';
import { InMemoryDbService } from 'angular-in-memory-web-api';

@Injectable({
  providedIn: 'root'
})
export class DataService implements InMemoryDbService {

  // This class creates a fake API which we can make HTTP requests to
  constructor() { }

  createDb() {
    return {
      posts: [
        {id: 1, userId: 1, title: 'Post Title 1', body: 'This is my cool post'},
        {id: 2, userId: 10, title: 'Post Title 2', body: 'This is my cool post'},
        {id: 3, userId: 15, title: 'Post Title 3', body: 'This is my cool post'}
      ]
    }
  }

}
