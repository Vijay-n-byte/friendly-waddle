import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EngineersiginComponent } from './engineersigin.component';

describe('EngineersiginComponent', () => {
  let component: EngineersiginComponent;
  let fixture: ComponentFixture<EngineersiginComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EngineersiginComponent]
    });
    fixture = TestBed.createComponent(EngineersiginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
