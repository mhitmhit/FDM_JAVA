import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Post } from '../../model/post';
import { PostsService } from '../../services/posts.service';

@Component({
  selector: 'app-create-post',
  templateUrl: './create-post.component.html',
  styleUrls: ['./create-post.component.css']
})
export class CreatePostComponent implements OnInit {

  constructor(private postsService: PostsService, private router: Router) {

  }

  ngOnInit(): void {
  }

  createPost() {
    let samplePost = {
      userId: 1000,
      title: 'This is my sample post',
      body: 'This is the body of my sample post. Maybe someday a real user will enter data in a form to submit a post...'
    }
    this.postsService.createPost(samplePost).then(
      // Success callback
      (post: Post) => {
        console.log('Successfully created a post', post);
        // We only route back to all posts when the post has been successfully created
        this.router.navigate(['/posts']);
      },
      // Failure callback
      (error: Error) => {
        console.error('Failed to create a post using our in-memory API', error);
      }
    )
  }

}
