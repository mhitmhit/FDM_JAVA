import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BasicBindingsComponent } from './components/basic-bindings/basic-bindings.component';
import { ExerciseCategoriesComponent } from './components/Categories/exercise-categories/exercise-categories.component';

@NgModule({
  declarations: [
    AppComponent,
    BasicBindingsComponent,
    ExerciseCategoriesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

