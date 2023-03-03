import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListMySpsComponent } from './list-my-sps.component';

describe('ListMySpsComponent', () => {
  let component: ListMySpsComponent;
  let fixture: ComponentFixture<ListMySpsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListMySpsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListMySpsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
