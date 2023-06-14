import { Component,OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { Customerdetails } from 'src/app/interfaces/customerdetails';
import { SampleserviceService } from 'src/app/services/sampleservice.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit{

  g:any;
  uf:string;
  

  constructor(private nn:SampleserviceService,private mm:Router){}
  ngOnInit(): void {
    this.nn.getcustomerspecific().subscribe(n=>{
       if(n!=null){
        console.log(n);
        this.g=n;
        this.uf=n.username;
        console.log(n.username);
       }
    })
  }

  logout(){
    this.mm.navigate(['customerlogin']);
    
  }
}
