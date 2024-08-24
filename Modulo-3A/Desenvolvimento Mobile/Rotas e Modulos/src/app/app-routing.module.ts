import { RouterModule, Routes } from '@angular/router';

import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { NgModule } from '@angular/core';

const routes: Routes = [
  { pathMatch: "full", path: "", redirectTo: "/dashboard" },
  {
    path: "dashboard",
    component: DashboardComponent,
  },
  { path: "users", loadChildren: () => import("./users/users.module").then(m => m.UsersModule) },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
