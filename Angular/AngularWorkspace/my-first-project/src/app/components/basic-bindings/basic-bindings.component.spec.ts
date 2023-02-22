import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicBindingsComponent } from './basic-bindings.component';

describe('BasicBindingsComponent', () => {
  let component: BasicBindingsComponent;
  let fixture: ComponentFixture<BasicBindingsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BasicBindingsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BasicBindingsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
