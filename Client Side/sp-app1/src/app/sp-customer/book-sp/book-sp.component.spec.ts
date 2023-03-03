import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookSpComponent } from './book-sp.component';

describe('BookSpComponent', () => {
  let component: BookSpComponent;
  let fixture: ComponentFixture<BookSpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookSpComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BookSpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
