import { Observer, Subscription } from 'rxjs';
import { Post } from './../../model/post';
import { PostsService } from './../../services/posts.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit{

  //post: Post | undefined;
  post!: Post;
  postSubscription!: Subscription;
  paramMapSubsciption!: Subscription;
  constructor(private postService: PostsService, private activatedRoute: ActivatedRoute){
  }

  ngOnInit(): void {
    let myRouteParamObserver: Observer<ParamMap> = {
      next: (paramMap: ParamMap) => {
        console.log('received paramMap from activated route', paramMap);
        let postId: string | null = paramMap.get('id');
        if(postId){
          let postIdAsNumber: number = parseInt(postId);
          this.postSubscription = this.postService.getPost(postIdAsNumber).subscribe(myPostObeserver);
        }
      },
      error(error: Error){
        console.log('error retrieving posts', error);
      },
      complete: () => {
        console.log('done receiving data from posts');
      }
    }

    let myPostObeserver: Observer<Post> = {
      next: (posts: Post) => {
        console.log('received posts from api', posts);
        this.post = posts;
      },
      error(error: Error){
        console.log('error retrieving posts', error);
      },
      complete: () => {
        console.log('done receiving data from posts');
      }
    }

    this.paramMapSubsciption = this.activatedRoute.paramMap.subscribe(myRouteParamObserver);

  }

  ngOnDestroy(): void {
    this.postSubscription.unsubscribe();
    this.paramMapSubsciption.unsubscribe();
  }

}
