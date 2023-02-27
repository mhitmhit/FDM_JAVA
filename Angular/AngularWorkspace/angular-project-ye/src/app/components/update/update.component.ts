import { NgForm } from '@angular/forms';
import { Contact } from './../../Model/contact';
import { Observer, Subscription } from 'rxjs';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { ContactsService } from './../../services/contacts.service';
import { Component, OnInit, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit, OnDestroy{

  private subscription!: Subscription;
  contactId!: number;
  userUpdated: boolean = false;
  contact!: Contact;
  formValid: boolean = false;

  constructor(private contactService: ContactsService, private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    let myObserver: Observer<ParamMap> = {
      next: this.loadContactUsingRouteId,
      error: (error: Error) => {
        console.error('An error occurred while retrieving the postId from the activatedRoute', error);
      },
      complete: () => {
        console.log('Received final value from paramMap');
      }
    }
    this.subscription = this.activatedRoute.paramMap.subscribe(myObserver);
  }

  private loadContactUsingRouteId = (paramMap: ParamMap) => {
    console.log('next() function is called inside myObserver by the activatedRoute paramMap');

    // Retrieve the route parameter from the activatedRoute
    let idAsString: string | null = paramMap.get('id');

    // Confirm that the route parameter is present
    if (idAsString !== null) {
      // Parse the routeParameter into a number
      let id: number = parseInt(idAsString);
      this.contactId = id;
    }
  }

updateContact(form: NgForm){
  if(form.valid){
    this.formValid = true;
  }
  this.contact = {...this.contact, ...form.value};
  this.contact.id = this.contactId;
  let myObserver: Observer<any> = {
    next: () => {
    },
    error(error: Error){
      console.log('error processing', error);
    },
    complete: () => {
      console.log('done processing');
    }
  }
  this.contactService.updateContact(this.contact).subscribe(myObserver);
  this.userUpdated = true;
}

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }


}
