import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListBookingSpsComponent } from './list-booking-sps.component';

describe('ListBookingSpsComponent', () => {
  let component: ListBookingSpsComponent;
  let fixture: ComponentFixture<ListBookingSpsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListBookingSpsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListBookingSpsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
