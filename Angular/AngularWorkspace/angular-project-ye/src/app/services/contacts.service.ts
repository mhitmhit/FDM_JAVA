import { Contact } from './../Model/contact';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContactsService {

  readonly BASE_URL = 'http://localhost:8080/api/v1/contacts/';
  headers = {headers: {'Content-Type': 'application/json'}};
  constructor(private httpClient: HttpClient) { }

  getContacts(): Observable<Contact[]>{
    return this.httpClient.get<Contact[]>(this.BASE_URL, this.headers);
  }

  getContact(idNumber: number): Observable<Contact>{
    return this.httpClient.get<Contact>(this.BASE_URL + idNumber, this.headers)
  }

  createContact(contact: Contact): Observable<any>{
    return this.httpClient.post<any>(this.BASE_URL, contact);
  }

  deleteContact(contactId: number): Observable<any>{
    return this.httpClient.delete(this.BASE_URL + contactId, this.headers);
  }

  updateContact(contact: Contact): Observable<any>{
    return this.httpClient.put<any>(this.BASE_URL + contact.id, contact);
  }
}
