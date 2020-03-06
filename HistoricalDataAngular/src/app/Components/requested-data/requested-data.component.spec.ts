import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RequestedDataComponent } from './requested-data.component';

describe('RequestedDataComponent', () => {
  let component: RequestedDataComponent;
  let fixture: ComponentFixture<RequestedDataComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RequestedDataComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RequestedDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
