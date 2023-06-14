import { Component, OnInit} from '@angular/core';
import {FormGroup,FormControl,FormArray,Validators} from '@angular/forms'; 
import { Ilogin } from '../interfaces/ilogin';
import { Router } from '@angular/router';
import { SampleserviceService } from '../services/sampleservice.service';
@Component({
  selector: 'app-managersignin',
  templateUrl: './managersignin.component.html',
  styleUrls: ['./managersignin.component.css']
})
export class ManagersigninComponent implements OnInit {

  userform!: FormGroup;

  data: Ilogin;
  bo:boolean;

  constructor(private s:SampleserviceService,private h:Router){}

  ngOnInit(): void {

    this.userform=new FormGroup({

      username:new FormControl('',
      [Validators.required,Validators.minLength(5),Validators.maxLength(10)]),
      password:new FormControl('',[Validators.required,Validators.minLength(3),Validators.maxLength(10)])
    });
    this.bo=false;
  }

  submited(y:FormGroup)
  {
    let p=y.value.password;
    console.log(y.value.username);
    console.log(y.value.password);
    this.s.getmlogincredentials(y.value.username).subscribe(m=>{
     if(m!=null){
      if(m.password===p){
        console.log("welcome");
        this.s.setm(y.value.username);
        this.h.navigate(['managerhome']);
      }
      else{
        console.log("go back");
      }
    }
    else{
      console.log("wrong username");
      this.bo=true;
      console.log(this.bo);
      
    }



      });  
    
  }

}
