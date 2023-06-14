import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagersigninComponent } from './managersignin.component';

describe('ManagersigninComponent', () => {
  let component: ManagersigninComponent;
  let fixture: ComponentFixture<ManagersigninComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ManagersigninComponent]
    });
    fixture = TestBed.createComponent(ManagersigninComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
