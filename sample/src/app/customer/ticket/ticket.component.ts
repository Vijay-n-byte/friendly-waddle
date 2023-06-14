import {Input, Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SampleserviceService } from 'src/app/services/sampleservice.service';

@Component({
  selector: 'app-ticket',
  templateUrl: './ticket.component.html',
  styleUrls: ['./ticket.component.css']
})
export class TicketComponent implements OnInit{

  @Input() g:any;
  j:boolean=false;

  constructor(private s:SampleserviceService,private h:Router){};

  ngOnInit(): void {

  }
  submitted(v){
    console.log(v.value);
    this.s.postcomplaints(v.value).subscribe();
    this.j=true;

  }
}
