import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { lastValueFrom } from 'rxjs/internal/lastValueFrom';
import { Post } from '../model/post';

@Injectable({
  providedIn: 'root'
})
export class PostsService {

  readonly BASE_URL = 'api/posts/'; // this matches what is in our DataService
  headers = {headers: {'Content-Type': 'application/json'}};

  constructor(private httpClient: HttpClient) { }

  getPosts(): Promise<Post[]> {
     return lastValueFrom(this.httpClient.get<Post[]>(this.BASE_URL, this.headers));
    //return this.httpClient.get<Post[]>(this.BASE_URL).toPromise();
  }

  getPost(id: number): Promise<Post> {
    //return this.httpClient.get<Post>(this.BASE_URL + id).toPromise();
    return lastValueFrom(this.httpClient.get<Post>(this.BASE_URL + id));

  }

  createPost(postWithoutId: {userId: number, title: string, body: string}): Promise<Post> {
    return lastValueFrom(this.httpClient.post<Post>(this.BASE_URL, postWithoutId));
    //return this.httpClient.post<Post>(this.BASE_URL, postWithoutId).toPromise();
  }

}
