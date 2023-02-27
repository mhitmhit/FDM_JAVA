import { Observer, Subscription } from 'rxjs';
import { Post } from './../../model/post';
import { PostsService } from './../../services/posts.service';
import { Component, OnInit, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-posts',
  templateUrl: './posts.component.html',
  styleUrls: ['./posts.component.css']
})
export class PostsComponent implements OnInit, OnDestroy {

  posts: Post[] = [];
  postSubscription!: Subscription;

  constructor(private postService: PostsService){
  }

  ngOnInit(): void {
    // create observer to consume posts from the API
    let myObeserver: Observer<Post[]> = {
      next: (posts: Post[]) => {
        console.log('received posts from api', posts);
        this.posts = posts;
      },
      error(error: Error){
        console.log('error retrieving posts', error);
      },
      complete: () => {
        console.log('done receiving data from posts');
      }
    }
    this.postSubscription = this.postService.getPosts().subscribe(myObeserver)
    // console.log('retrieved all posts', allPosts);
    // this.posts = allPosts;
  }

  ngOnDestroy(): void {
    this.postSubscription.unsubscribe();
  }
}
