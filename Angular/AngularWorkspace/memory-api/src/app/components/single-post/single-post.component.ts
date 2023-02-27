import { PostsService } from './../../services/posts.service';
import { Post } from './../../model/post';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, ParamMap, Router } from '@angular/router';
import { Observer, Subscription } from 'rxjs';

@Component({
  selector: 'app-single-post',
  templateUrl: './single-post.component.html',
  styleUrls: ['./single-post.component.css']
})
export class SinglePostComponent implements OnInit, OnDestroy {

  // ! allows the post to be declared without being initialized
  post!: Post;
  private subscription!: Subscription;

  constructor(private postsService: PostsService, private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    let myObserver: Observer<ParamMap> = {
      next: this.loadPostUsingRouteId, // using private function to reduce function length
      error: (error: Error) => {
        console.error('An error occurred while retrieving the postId from the activatedRoute', error);
      },
      complete: () => {
        console.log('Received final value from paramMap');
      }
    }

    // TODO - check diff. between queryParamMap, paramMap, and queryParams
    this.subscription = this.activatedRoute.paramMap.subscribe(myObserver);
  }

  private loadPostUsingRouteId = (paramMap: ParamMap) => {
    console.log('next() function is called inside myObserver by the activatedRoute paramMap');

    // Retrieve the route parameter from the activatedRoute
    let idAsString: string | null = paramMap.get('id');

    // Confirm that the route parameter is present
    if (idAsString !== null) {
      // Parse the routeParameter into a number
      let id: number = parseInt(idAsString);

      this.loadPost(id);
    }
  }

  private loadPost(postId: number) {
    // Pass the id to the service, which will then load the correct post
    this.postsService.getPost(postId).then(
      // Success callback
      (post: Post) => {
        this.post = post;
      },
      // Failure callback
      (error: Error) => {
        console.error('Error occurred when retrieving a single post', error);
      }
    );
  }

  ngOnDestroy(): void {
    console.log('Now unsubscribing from paramMap subscription')
    this.subscription.unsubscribe();
  }

}
