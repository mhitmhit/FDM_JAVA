import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BasicBindingsComponent } from './components/basic-bindings/basic-bindings.component';
import { ExerciseCategoriesComponent } from './components/Categories/exercise-categories/exercise-categories.component';
import { LoginTwowaybindingComponent } from './components/login-twowaybinding/login-twowaybinding.component';
import { PipesComponent } from './components/pipes/pipes.component';
import { DoublePipe } from './components/pipes/double.pipe';
import { FormsComponent } from './components/forms/forms.component';

@NgModule({
  declarations: [
    AppComponent,
    BasicBindingsComponent,
    ExerciseCategoriesComponent,
    LoginTwowaybindingComponent,
    PipesComponent,
    DoublePipe,
    FormsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

