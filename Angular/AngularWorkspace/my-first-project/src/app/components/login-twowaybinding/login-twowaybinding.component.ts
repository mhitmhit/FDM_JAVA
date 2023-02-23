import { ValidationService } from './../../services/validation.service';
import { Component } from '@angular/core';

@Component({
  selector: 'app-login-twowaybinding',
  templateUrl: './login-twowaybinding.component.html',
  styleUrls: ['./login-twowaybinding.component.css']
})
export class LoginTwowaybindingComponent {

  username: string = '';
  password: string = '';
  credentialsValid: boolean = false;

  readonly CORRECT_USERNAME: string = "FDMUser";
  readonly CORRECT_PASSWORD: string = '1234';

  constructor(private validationService: ValidationService){

  }

  validate(): void {
    this.credentialsValid = this.validationService.validate(this.username, this.password);
  }
}
