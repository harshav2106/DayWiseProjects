import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Ex15Homecomp } from './ex-15-homecomp';

describe('Ex15Homecomp', () => {
  let component: Ex15Homecomp;
  let fixture: ComponentFixture<Ex15Homecomp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Ex15Homecomp]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Ex15Homecomp);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
