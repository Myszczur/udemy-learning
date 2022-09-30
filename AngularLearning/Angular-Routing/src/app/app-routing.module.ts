import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from "./components/home/home.component";
import {BlogComponent} from "./components/blog/blog.component";
import {AboutComponent} from "./components/about/about.component";
import {UsersComponent} from "./components/users/users.component";
import {UsersDetailComponent} from "./components/users-detail/users-detail.component";
import {PlaceholderComponent} from "./components/placeholder/placeholder.component";
import {AuthGuard} from "./guards/auth/auth.guard";
import {ConfirmationGuard} from "./guards/confirmation/confirmation.guard";

const routes: Routes = [
  {path: 'home', component: HomeComponent, canDeactivate: [ConfirmationGuard]},
  {path: 'blog', component: BlogComponent, canActivate: [AuthGuard]},
  {path: 'about', component: AboutComponent},
  {
    path: 'users',
    component: UsersComponent,
    canActivateChild: [AuthGuard],
    children: [
      {path: ':id', component: UsersDetailComponent},
      {path: '', component: PlaceholderComponent}
    ]
  },
  {path: '**', redirectTo: '/home', pathMatch: 'full'}
];

@NgModule({
  providers: [AuthGuard],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
