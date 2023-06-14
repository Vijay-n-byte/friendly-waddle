import { Component ,OnInit} from '@angular/core';
import { SampleserviceService } from 'src/app/services/sampleservice.service';

@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.css']
})
export class HistoryComponent implements OnInit {

  g:any;
  constructor(private nn:SampleserviceService){};
  ngOnInit(): void {
    this.nn.getcustomerspecific().subscribe(n=>{
      if(n!=null){
       console.log(n);
       this.g=n;
       console.log(n.username);
      }
   })
    
  }

}
