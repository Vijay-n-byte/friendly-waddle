import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminsigninComponent } from './adminsignin/adminsignin.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { AdminComponent } from './admin/admin/admin.component';
import { ChangepassComponent } from './admin/changepass/changepass.component';
import { AdminhomeComponent } from './admin/adminhome/adminhome.component';
import { CustomerloginComponent } from './customerlogin/customerlogin.component';
import { CustomerComponent } from './customer/customer/customer.component';






import { TicketComponent } from './customer/ticket/ticket.component';
import { HistoryComponent } from './customer/history/history.component';
import { ManagersigninComponent } from './managersignin/managersignin.component';
import { ManagerhomeComponent } from './manager/managerhome/managerhome.component';
import { EngineersiginComponent } from './engineersigin/engineersigin.component';
import { EngineerhomeComponent } from './engineer/engineerhome/engineerhome.component';


const routes: Routes = [
  {path:"",component:WelcomeComponent},
  {path:"customerlogin",component:AdminsigninComponent},
  {path:"adminlogin",component:CustomerloginComponent},
  {path:"managerlogin",component:ManagersigninComponent},
  {path:"managerhome",component:ManagerhomeComponent},
  {path:"engineerlogin",component:EngineersiginComponent},
  {path:"engineerhome",component:EngineerhomeComponent},
  {path:"adminpage",component:AdminComponent,children:[{path:"customeredit",component:AdminhomeComponent}]},
  {path:"customerhome",component:CustomerComponent,children:[{path:"raiseticket",component:TicketComponent},
  {path:"tickethistory",component:HistoryComponent}]},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
