import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { DateComponent } from './date.component';
import { BadgeComponent } from './components/badge/badge.component';
import { CardComponent } from './components/card/card.component';
import { SearchPipe } from './pipes/search.pipe';
import { FirstComponent } from './components/first/first.component';
import { SecondComponent } from './components/second/second.component';
import { CountryComponent } from './components/country/country.component';
import { CityComponent } from './components/city/city.component';

@NgModule({
  declarations: [
    AppComponent, DateComponent, BadgeComponent, CardComponent, SearchPipe, FirstComponent, SecondComponent, CountryComponent, CityComponent
  ],
  imports: [
    BrowserModule, HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
