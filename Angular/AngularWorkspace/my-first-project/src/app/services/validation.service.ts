import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ValidationService {

  readonly CORRECT_USERNAME: string = "FDMUser";
  readonly CORRECT_PASSWORD: string = '1234';

  constructor() { }

  validate(usernameToCheck: string, passwordToCheck: string): boolean {
    return usernameToCheck===this.CORRECT_USERNAME && passwordToCheck===this.CORRECT_PASSWORD;
  }
}
