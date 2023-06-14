import { HttpClient, HttpRequest } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ilogin } from '../interfaces/ilogin';
import { Products } from '../interfaces/products';
import { Customer } from '../interfaces/customer';
import { Customerdetails } from '../interfaces/customerdetails';
import { Addtocart } from '../interfaces/addtocart';
import { Assigni } from '../interfaces/assigni';

@Injectable({
  providedIn: 'root'
})
export class SampleserviceService {
  data:Ilogin;
  user:string;
  customerid:number;
  totalprice:number;

  userm:string;
  usere:string;
 

  constructor(private http:HttpClient) { }

  private api1:string="http://localhost:8080/login/customer/";
  private api2:string="http://localhost:8080/customer/";
  private api3:string="http://localhost:8080/customer";
  private api4:string="http://localhost:8080/login/manager/";
  private api5:string="http://localhost:8080/manager";
  private api6:string="http://localhost:8080/login/engineer/";
  private api7:string="http://localhost:8080/engineer/";
  private api8:string="http://localhost:8080/engineer";
  private api9:string="http://localhost:8080/login/admin/";
  private api10:string="http://localhost:8080/admin/customer";
  
  
  
  set(n:string){
    this.user=n;
  }
  get():string{
    return this.user;
  }

  setm(n:string){
    this.userm=n;
  }
  getm():string{
    return this.userm;
  }

  sete(n:string){
    this.usere=n;
  }
  gete():string{
    return this.usere;
  }

  getclogincredentials(username:string):Observable<Ilogin | null> | null {
    let y=this.api1+username;
    let z=this.http.get<Ilogin>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  getalogincredentials(username:string):Observable<Ilogin | null> | null {
    let y=this.api9+username;
    let z=this.http.get<Ilogin>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  getmlogincredentials(username:string):Observable<Ilogin | null> | null {
    let y=this.api4+username;
    let z=this.http.get<Ilogin>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  getelogincredentials(username:string):Observable<Ilogin | null> | null {
    let y=this.api6+username;
    let z=this.http.get<Ilogin>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  getcustomerspecific():Observable<Ilogin | null> | null {
    let y=this.api2+this.user;
    let z=this.http.get<any>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  getmanagerspecific():Observable<any| null> | null {
    let y=this.api5;
    let z=this.http.get<any>(y);
  //  z.subscribe(m=>this.data=m);
    return z;
  }

  getengineerspecific():Observable<any | null> | null {
    let y=this.api7+this.usere;
    let z=this.http.get<any>(y);
    z.subscribe(m=>this.data=m);
    console.log(this.data);
    return z;
  }

  postcomplaints(b):Observable<any|null>|null{
    console.log(b);
   // return null;
    return this.http.post<any>(this.api3,b);

  }

  postassigndetails(i:string,hj:number):Observable<any|null>|null{
    let d:Assigni={
      ticketnumber:hj,
      username:i
    }
    console.log(d);
    return this.http.post<Assigni>(this.api5,d); 
  }

  poststatusdetails(hj:number):Observable<any|null>|null{
    let d:Assigni={
      ticketnumber:hj,
      username:this.usere
    }
    console.log(d);
    return this.http.post<Assigni>(this.api8,d); 
  }

  getallcustomercredentials():Observable<any | null> | null {
    let y=this.api10;
    let z=this.http.get<Ilogin>(y);
    return z;
  }

  postnewcustomerdetails(hj:any):Observable<any|null>|null{
    return this.http.post<Assigni>(this.api10,hj); 
  }
  



  

 





//   set1(m:number){
//    // console.log(m);
//     this.customerid=m;
//   }

//   settotalprice(m:number){
//     console.log(m);
//     this.totalprice=m;
//   }

//   gettotalprice():number{
//     return this.totalprice;
//   }

//   customerbookingcofirm():Observable<any|null>|null{
//     let r=`${this.root8}${this.customerid}/confirm`;
//     return this.http.post<any>(r,null);
//   }
 

//   addtocart(pr:number,qu:number):Observable<Addtocart|null>|null{
//     let r:number=this.customerid as number;
//     let w=`${this.root6}${this.customerid}`;
//     console.log(w);
   
//     let d:Addtocart={productnumber:pr,quantity:qu};
   
//    return this.http.post<Addtocart>(w,d); 
//  }

//  getcart():Observable<any|null>|null{
//   let w=`${this.root7}${this.customerid}`;
//   console.log(w);
//   return this.http.get<any>(w);
//  }

//   getcustomerdetails():Observable<Customerdetails|null>|null{
//     let k:string=`${this.root4}${this.user}`;
//     return this.http.get<Customerdetails>(k);
//   }
  

  


//   putadminlogincredentials(y:string,z:string):Observable<Ilogin|null>|null{
//     let h=this.rootadup;
//     let d:Ilogin={username:y,password:z};
//     return this.http.put<Ilogin>(h,d);
//   }

//   getadminlogincredentials(username:string):Observable<Ilogin | null> | null {
//     let y=this.rootad+username;
//     let z=this.http.get<Ilogin>(y);
//     z.subscribe(m=>this.data=m);
//     console.log(this.data);
//     return z;
//   }

//   deleteproducts(n:number):Observable<Products|null>|null{
//     let y=`${this.root1}/${n}`;
//     return this.http.delete<Products>(y);
//   }

//   getproductsdetails():Observable<Products|null>|null{
//     return this.http.get<Products>(this.root1);
//   } 

//   uploadimg(h:number,j:FormData){
//     let y=`${this.root2}/${h}`;
//     return this.http.post(y,j);
//   }

//   signin(d:Customer):Observable<Customer|null>|null{
//     return this.http.post<Customer>(this.root3,d);
    
//   }

//   uploadproducts(y:Products):Observable<any|null>|null{
//     console.log(y);
//    return this.http.post(this.root1,JSON.stringify(y));
//   }

}

