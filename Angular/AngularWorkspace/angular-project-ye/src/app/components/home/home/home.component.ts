import { ContactsService } from './../../../services/contacts.service';
import { Observer, Subscription } from 'rxjs';
import { Contact } from './../../../Model/contact';
import { Component, OnDestroy, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit, OnDestroy{

  contacts: Contact[] = [];
  contactSubscription!: Subscription;

  constructor(private contactService: ContactsService){
  }

  ngOnInit(): void {
    //this.contacts = [{"id":11,"firstName":"yas333","middleName":"E3333","lastName":"el3333","phoneNumber":"2093485-4218"},{"id":13,"firstName":"kot","middleName":"S","lastName":"San","phoneNumber":"928374598"}]
    let myObeserver: Observer<Contact[]> = {
      next: (contacts: Contact[]) => {
        console.log('received contactss from api', contacts);
        this.contacts = contacts;
      },
      error(error: Error){
        console.log('error retrieving contactss', error);
      },
      complete: () => {
        console.log('done receiving data from contactss');
      }
    }
    this.contactSubscription = this.contactService.getContacts().
      subscribe(myObeserver)
  }

  ngOnDestroy(): void {
    this.contactSubscription.unsubscribe();
  }

}
