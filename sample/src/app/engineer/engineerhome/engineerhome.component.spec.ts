import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EngineerhomeComponent } from './engineerhome.component';

describe('EngineerhomeComponent', () => {
  let component: EngineerhomeComponent;
  let fixture: ComponentFixture<EngineerhomeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EngineerhomeComponent]
    });
    fixture = TestBed.createComponent(EngineerhomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
