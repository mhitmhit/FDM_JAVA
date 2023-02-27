import { UpdateComponent } from './components/update/update.component';
import { DeleteComponent } from './components/delete/delete.component';
import { CreateContactComponent } from './components/create-contact/create-contact.component';
import { ContactComponent } from './components/contact/contact.component';
import { HomeComponent } from './components/home/home/home.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path: '', component:HomeComponent},
  {path: 'contact/:id', component:ContactComponent},
  {path: 'create', component:CreateContactComponent},
  {path: 'delete/:id', component:DeleteComponent},
  {path: 'update/:id', component:UpdateComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
