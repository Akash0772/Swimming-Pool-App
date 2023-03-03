import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchSpComponent } from './search-sp.component';

describe('SearchSpComponent', () => {
  let component: SearchSpComponent;
  let fixture: ComponentFixture<SearchSpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SearchSpComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SearchSpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
