import { ActivatedRoute } from '@angular/router';
import { PostsService } from './../../services/posts.service';
import { Post } from './../../model/post';
import { Component, OnInit, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit, OnDestroy {

  posts: Post[] = [];

  constructor(private postsService: PostsService) {

    // TODO - make the table interactive with routerLink
    // TODO - route parameters to view a single post

    // We use subscribe() if we are getting data from an Observable

    // We use then() since getPosts() returns a Promise

  }

  ngOnInit(): void {
    // Promises have a function called then()
    // The then() function takes in functions as arguments - these are called "callback" functions
    this.postsService.getPosts().then(
      // "Success callback" - this runs if the API/service successfully gets data
      (posts) => {
        console.log('Got posts', posts);
        this.posts = posts;
      },
      // "Failure callback" - this runs if the API request fails
      (error) => {
        console.error('An error occurred while trying to retrieve all posts', error);
      }
    );
  }

  ngOnDestroy(): void {
      console.log('PostsComponent destroyed()');
  }

}
