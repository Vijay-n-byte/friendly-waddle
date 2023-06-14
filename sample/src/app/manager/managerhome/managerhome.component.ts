import { Component ,OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { SampleserviceService } from 'src/app/services/sampleservice.service';

@Component({
  selector: 'app-managerhome',
  templateUrl: './managerhome.component.html',
  styleUrls: ['./managerhome.component.css']
})
export class ManagerhomeComponent implements OnInit {
  
  public ff:any;
  constructor(private f:SampleserviceService,private t :Router){};
  ngOnInit(): void {
    this.f.getmanagerspecific().subscribe(n=>{
      if(n!=null){
        console.log(n);
        this.ff=n;
      }
    });
    
  }
  logout(){
    this.t.navigate(['managerlogin']);
   
  }
  assigned(lq,m){
    let h:string=lq.target.value;
    console.log(m);
    this.f.postassigndetails(h,m).subscribe();
    this.t.navigateByUrl('/',{skipLocationChange:true}).then(()=>{
      this.t.navigate(['/managerhome'])
    });
  }
}
