import { Component ,OnInit} from '@angular/core';
import { PopupaddComponent } from '../admin/popupadd/popupadd.component';
import {MatDialog} from '@angular/material/dialog'
import { Router } from '@angular/router';
@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {

  l1:number;
  kk:String;
  images:Array<String>=["https://www.adientone.com/wp-content/uploads/2020/10/top-4-trends-telecommunications.jpg",
"https://www.telemediaonline.co.uk/wp-content/uploads/2018/03/shutterstock_1007765257.jpg",
"https://salyso.com.do/wp-content/uploads/2018/04/1_48_file_302_526.jpg"];

  constructor(private h:Router){}
  ngOnInit(): void {
    this.l1=0;
    this.kk="https://tse2.mm.bing.net/th?id=OIP.gZreq1IIbTkA_xWpombXKAHaEO&pid=Api&P=0&h=180";
  }

  shownext():void{
    console.log("next");
    this.kk=this.images[this.l1];
    this.l1=this.l1+1;
    if(this.l1===this.images.length){
      this.l1=0;
    }
  }
 

}
