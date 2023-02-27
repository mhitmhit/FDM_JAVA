import { Observer } from 'rxjs';
import { Contact } from './../../Model/contact';
import { ContactsService } from './../../services/contacts.service';
import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-create-contact',
  templateUrl: './create-contact.component.html',
  styleUrls: ['./create-contact.component.css']
})
export class CreateContactComponent {

  formValid: boolean = false;
  contact!: Contact;
  constructor(private contactService: ContactsService){}

  processTheForm(form: NgForm){

    if(form.valid){
      this.formValid = true;
    }
    this.contact = {...this.contact, ...form.value};
    
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
    this.contactService.createContact(this.contact).subscribe(myObserver);

  }
}
