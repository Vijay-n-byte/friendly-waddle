import { Component, OnInit } from '@angular/core';
import {MatDialog} from '@angular/material/dialog'
import { PopupaddComponent } from '../popupadd/popupadd.component';
import { FixedSizeVirtualScrollStrategy } from '@angular/cdk/scrolling';
import {FormGroup,FormControl,FormArray,Validators} from '@angular/forms'; 
import { SampleserviceService } from 'src/app/services/sampleservice.service';
import { ActivatedRoute, Router } from '@angular/router';
import { Products } from 'src/app/interfaces/products';

@Component({
  selector: 'app-adminhome',
  templateUrl: './adminhome.component.html',
  styleUrls: ['./adminhome.component.css']
})
export class AdminhomeComponent implements OnInit {

  public k:any;
  op="modalbackground1";
  constructor(private g:SampleserviceService,private j:Router){}
  openmodel="modal";
  r:number;
  w:any;

  ngOnInit(): void {
    this.g.getallcustomercredentials().subscribe(n=>{
      if(n!=null){
        this.w=n;
      }
    });
  }

  openmodal(){
    this.op="modalbackground";
  }
  closemodal(){
    this.op="modalbackground1";
    this.j.navigateByUrl('/',{skipLocationChange:true}).then(()=>{
      this.j.navigate(['/adminpage/customeredit'])
    });
  }
  submitvalue(){
    // console.log(n.value);
  }

 
}
