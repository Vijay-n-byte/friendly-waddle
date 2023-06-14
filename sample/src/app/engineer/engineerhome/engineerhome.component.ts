import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SampleserviceService } from 'src/app/services/sampleservice.service';

@Component({
  selector: 'app-engineerhome',
  templateUrl: './engineerhome.component.html',
  styleUrls: ['./engineerhome.component.css']
})
export class EngineerhomeComponent implements OnInit{


  public ff:any;
  constructor(private f:SampleserviceService,private t :Router){};
  ngOnInit(): void {
    this.f.getengineerspecific().subscribe(n=>{
      if(n!=null){
        console.log(n);
        this.ff=n;
      }
    });
    
  }

  logout(){
    this.t.navigate(['engineerlogin']);

  }
  closeticket(h1:number,h2:string){
    console.log(h1);
    this.f.poststatusdetails(h1).subscribe();
  //  this.t.navigate(['engineerhome']);
    this.t.navigateByUrl('/',{skipLocationChange:true}).then(()=>{
      this.t.navigate(['/engineerhome'])
    });
  }

}
