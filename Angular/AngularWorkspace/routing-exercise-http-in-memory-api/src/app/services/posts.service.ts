import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Post } from '../model/post';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  readonly BASE_URL = 'api/posts/'; // this matches what is in our DataService

  constructor(private httpClient: HttpClient) { }

  getPosts(): Promise<Post[]> {
    // return lastValueFrom(this.httpClient.get<Post[]>('https://jsonplaceholder.typicode.com/posts'));
    return this.httpClient.get<Post[]>(this.BASE_URL).toPromise();
  }

  getPost(id: number): Promise<Post> {
    return this.httpClient.get<Post>(this.BASE_URL + id).toPromise();
  }

  createPost(postWithoutId: {userId: number, title: string, body: string}): Promise<Post> {
    return this.httpClient.post<Post>(this.BASE_URL, postWithoutId).toPromise();
  }

}
