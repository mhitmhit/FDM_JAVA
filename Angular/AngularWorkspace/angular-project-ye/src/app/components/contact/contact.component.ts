import { Contact } from './../../Model/contact';
import { Component, OnInit, OnDestroy } from '@angular/core';
import { ContactsService } from './../../services/contacts.service';
import { Observer, Subscription } from 'rxjs';
import { ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit{

  contact!: Contact;
  contactSubscription!: Subscription;
  paramMapSubsciption!: Subscription;
  constructor(private contactService: ContactsService, private activatedRoute: ActivatedRoute){
  }

  ngOnInit(): void {
    let myRouteParamObserver: Observer<ParamMap> = {
      next: (paramMap: ParamMap) => {
        console.log('received paramMap from activated route', paramMap);
        let contactId: string | null = paramMap.get('id');
        if(contactId){
          let contactIdAsNumber: number = parseInt(contactId);
          this.contactSubscription = this.contactService.getContact(contactIdAsNumber).subscribe(myPostObeserver);
        }
      },
      error(error: Error){
        console.log('error retrieving contact', error);
      },
      complete: () => {
        console.log('done receiving data from contact');
      }
    }

    let myPostObeserver: Observer<Contact> = {
      next: (contacts: Contact) => {
        console.log('received contacts from api', contacts);
        this.contact = contacts;
      },
      error(error: Error){
        console.log('error retrieving contacts', error);
      },
      complete: () => {
        console.log('done receiving data from contacts');
      }
    }

    this.paramMapSubsciption = this.activatedRoute.paramMap.subscribe(myRouteParamObserver);

  }

  ngOnDestroy(): void {
    this.contactSubscription.unsubscribe();
    this.paramMapSubsciption.unsubscribe();
  }

}

