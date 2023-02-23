import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginTwowaybindingComponent } from './login-twowaybinding.component';

describe('LoginTwowaybindingComponent', () => {
  let component: LoginTwowaybindingComponent;
  let fixture: ComponentFixture<LoginTwowaybindingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginTwowaybindingComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LoginTwowaybindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
