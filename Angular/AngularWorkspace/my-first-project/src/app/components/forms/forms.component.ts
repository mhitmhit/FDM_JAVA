import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent {

  // usernameVar: string = '';
  // passwordVar: string = '';

  constructor(){}

  processTheForm(form: NgForm){
    console.log('received a form: '+ form);
    console.log('validity status: '+ form.valid)

    console.log('form received: ' + JSON.stringify(form.value));


  }

}
