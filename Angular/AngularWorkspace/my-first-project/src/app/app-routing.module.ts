import { NotFoundComponent } from './components/not-found/not-found.component';
import { LoginTwowaybindingComponent } from './components/login-twowaybinding/login-twowaybinding.component';
import { FormsComponent } from './components/forms/forms.component';
import { PipesComponent } from './components/pipes/pipes.component';
import { ExerciseCategoriesComponent } from './components/Categories/exercise-categories/exercise-categories.component';
import { BasicBindingsComponent } from './components/basic-bindings/basic-bindings.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path:'binding', component:BasicBindingsComponent},
  {path:'categories', component:ExerciseCategoriesComponent},
  {path:'pipes', component:PipesComponent},
  {path:'form', component:FormsComponent},
  {path:'twowaybinding', component:LoginTwowaybindingComponent},
  {path:'**', component:NotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
